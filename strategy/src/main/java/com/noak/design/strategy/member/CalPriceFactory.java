package com.noak.design.strategy.member;

import com.noak.design.strategy.member.annotation.PriceRegion;
import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yeww
 * @since 2018-06-27
 */

@Slf4j
public class CalPriceFactory {
    private static final String CAL_PRICE_PACKAGE = "com.noak.design.strategy.member";
    private ClassLoader classLoader = getClass().getClassLoader();
    // 策略列表
    private List<Class<? extends CalPrice>> calPriceList;

    private CalPriceFactory() {
        init();
    }

    public static CalPriceFactory getInstance() {
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance {
        private static CalPriceFactory instance = new CalPriceFactory();
    }

    public CalPrice createCalPrize(Player cumstomer) {
        for (Class<? extends CalPrice> clazz : calPriceList) {

            PriceRegion validRegion = handleAnnotation(clazz);
            if (validRegion.min() < cumstomer.getTotalAmount() && cumstomer.getTotalAmount() < validRegion.max()) {
                try {
                    return clazz.newInstance();
                } catch (Exception e) {
                    log.error("创建策略实体失败", e);
                    throw new RuntimeException(e);
                }
            }
        }
        throw new RuntimeException("未能查询到对应的策略");
    }

    private PriceRegion handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] annotations = clazz.getAnnotations();
        if (annotations == null || annotations.length <= 0) {
            return null;
        }
        for (Annotation annotation : annotations) {
            if (annotation instanceof PriceRegion) {
                return (PriceRegion) annotation;
            }
        }
        return null;
    }

    private void init() {
        calPriceList = new ArrayList<>();
        File[] resource = getResources();
        Class<CalPrice> calPriceClazz = null;
        try {
            calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());
        } catch (Exception e) {
            throw new RuntimeException("未找到策略接口");
        }

        for (File file : resource) {
            try {
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + file.getName().replace(".class", ""));
                if(CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz){
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取包下所有class文件
     *
     * @return
     */
    private File[] getResources() {

        try {
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(pathname -> pathname.getName().endsWith(".class"));
        } catch (Exception e) {
            throw new RuntimeException("为找到策略类所在文件夹");
        }
    }
}
