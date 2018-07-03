package com.noak.design.abstractfactory;

/**
 * @author yeww
 * @since 2018-07-03
 */
public interface KingdomFactory {

    Army createArmy();

    Castle createCastle();

    King createKing();
}
