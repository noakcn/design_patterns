package com.noak.design.abstractfactory;

/**
 * @author yeww
 * @since 2018-07-03
 */
public class FactoryMaker {

    public enum KingdomType {
        ELF, ORC
    }

    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalStateException("无效的类型 ");
        }

    }
}
