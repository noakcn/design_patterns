package com.noak.design.singleton;

/**
 * @author yeww
 * @since 2018-07-02
 */
public class IvoryTower {
    private IvoryTower() {}

    /**
     * 饿汉模式
     */
    private static final IvoryTower INSTANCE = new IvoryTower();

    public static IvoryTower getInstance() {
        return INSTANCE;
    }
}
