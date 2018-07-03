package com.noak.design.abstractfactory;

/**
 * @author yeww
 * @since 2018-07-03
 */
public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Army createArmy() {
        return new ElfArmy();
    }

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }
}
