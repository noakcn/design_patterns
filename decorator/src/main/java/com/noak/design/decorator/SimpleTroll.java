package com.noak.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-07-04
 */
@Slf4j
public class SimpleTroll implements Troll {
    @Override
    public void attack() {
        log.info("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        log.info("The troll shrieks in horror and runs away!");
    }
}
