package com.noak.design.singleton;

/**
 * @author yeww
 * @since 2018-07-02
 */
public final class InitializingOnDemandHolderIdiom {
    private InitializingOnDemandHolderIdiom() {}

    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }

    private static class HelperHolder {
        private static final InitializingOnDemandHolderIdiom INSTANCE = new InitializingOnDemandHolderIdiom();
    }
}
