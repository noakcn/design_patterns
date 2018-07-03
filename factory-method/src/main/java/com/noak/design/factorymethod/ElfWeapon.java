package com.noak.design.factorymethod;

/**
 * @author yeww
 * @since 2018-07-03
 */
public class ElfWeapon implements Weapon {

    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Elven " + weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
