package com.noak.design.factorymethod;

/**
 * @author yeww
 * @since 2018-07-03
 */
public class OrcWeapon implements Weapon {


    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Orcish " + weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
