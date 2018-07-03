package com.noak.design.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-07-03
 */
@Slf4j
public class App {

    private final Blacksmith blacksmith;

    public App(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public static void main(String[] args) {
        App app = new App(new ElfBlacksmith());
        app.manufactureWeapons();

        app = new App(new OrcBlacksmith());
        app.manufactureWeapons();
    }

    private void manufactureWeapons() {
        Weapon weapon;
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(weapon.toString());
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        log.info(weapon.toString());
    }
}
