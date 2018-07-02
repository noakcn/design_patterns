package com.noak.design.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-06-27
 */
@Slf4j
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyInterface() {
        log.info("策略B");
    }
}
