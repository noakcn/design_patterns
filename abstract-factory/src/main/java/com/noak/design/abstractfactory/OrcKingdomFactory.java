package com.noak.design.abstractfactory;

/**
 * @author yeww
 * @since 2018-07-03
 */
public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Army createArmy() {
        return new OrcArmy();
    }

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }
}
