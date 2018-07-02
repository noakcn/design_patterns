package com.noak.design.strategy;

/**
 * 策略角色类
 *
 * @author yeww
 * @since 2018-06-27
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy() {
        this.strategy.strategyInterface();
    }
}
