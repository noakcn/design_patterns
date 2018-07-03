package com.noak.design.factorymethod;

/**
 * @author yeww
 * @since 2018-07-03
 */
public class OrcBlacksmith  implements Blacksmith{
    @Override
    public Weapon manufactureWeapon(WeaponType name) {
        return new OrcWeapon(name);
    }
}
