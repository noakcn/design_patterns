package com.noak.design.singleton;

/**
 * @author yeww
 * @since 2018-07-02
 */
public enum EnumIvoryTower {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
