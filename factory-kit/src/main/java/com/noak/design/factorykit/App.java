package com.noak.design.factorykit;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-07-02
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        WeaponFactory factory = WeaponFactory.factory(builder -> {
            builder.add(WeaponType.SWORD, Sword::new);
            builder.add(WeaponType.AXE, Axe::new);
            builder.add(WeaponType.SPEAR, Spear::new);
            builder.add(WeaponType.BOW, Bow::new);
        });

        Weapon axe = factory.create(WeaponType.AXE);
        log.info("weapon = {}",axe.toString());
    }
}
