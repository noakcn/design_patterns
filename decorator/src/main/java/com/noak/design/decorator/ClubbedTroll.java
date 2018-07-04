package com.noak.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-07-04
 */
@Slf4j
public class ClubbedTroll implements Troll {

    private Troll decoratedTroll;

    public ClubbedTroll(Troll troll) {
        this.decoratedTroll = troll;
    }

    @Override
    public void attack() {
        decoratedTroll.attack();
        log.info("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return decoratedTroll.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decoratedTroll.fleeBattle();
    }
}
