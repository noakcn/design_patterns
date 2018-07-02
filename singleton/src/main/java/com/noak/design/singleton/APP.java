package com.noak.design.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-07-02
 */
@Slf4j
public class APP {

    public static void main(String[] args) {
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();
        log.info("ivoryTower1 = {}", ivoryTower1);
        log.info("ivoryTower2 = {}", ivoryTower2);

        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        log.info("enumIvoryTower1 = {}", enumIvoryTower1);
        log.info("enumIvoryTower2 = {}", enumIvoryTower2);

        InitializingOnDemandHolderIdiom initializingOnDemandHolderIdiom1 = InitializingOnDemandHolderIdiom.getInstance();
        InitializingOnDemandHolderIdiom initializingOnDemandHolderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
        log.info("initializingOnDemandHolderIdiom1 = {}", initializingOnDemandHolderIdiom1);
        log.info("initializingOnDemandHolderIdiom2 = {}", initializingOnDemandHolderIdiom2);

        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower1= ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        log.info("threadSafeLazyLoadedIvoryTower1 = {}",threadSafeLazyLoadedIvoryTower1);
        log.info("threadSafeLazyLoadedIvoryTower2 = {}",threadSafeLazyLoadedIvoryTower2);

        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking2 = ThreadSafeDoubleCheckLocking.getInstance();
        log.info("threadSafeDoubleCheckLocking1 = {}",threadSafeDoubleCheckLocking1);
        log.info("threadSafeDoubleCheckLocking2 = {}",threadSafeDoubleCheckLocking2);

    }

}
