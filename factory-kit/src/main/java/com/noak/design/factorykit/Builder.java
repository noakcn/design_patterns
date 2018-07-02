package com.noak.design.factorykit;

import java.util.function.Supplier;

/**
 * @author yeww
 * @since 2018-07-02
 */
public interface Builder {
    void add(WeaponType name, Supplier<Weapon> supplier);
}
