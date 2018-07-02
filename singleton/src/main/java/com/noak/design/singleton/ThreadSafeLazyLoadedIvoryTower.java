package com.noak.design.singleton;

/**
 * @author yeww
 * @since 2018-07-02
 */
public final class ThreadSafeLazyLoadedIvoryTower {
    private static ThreadSafeLazyLoadedIvoryTower instance;

    private ThreadSafeLazyLoadedIvoryTower(){
        if (instance == null) {
            instance = this;
        }else {
            throw new IllegalStateException("已存在实例");
        }
    }

    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }

        return instance;
    }
}
