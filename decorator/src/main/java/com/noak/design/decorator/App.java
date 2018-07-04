package com.noak.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-07-04
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("SimpleTroll");
        SimpleTroll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        log.info("simple troll power = {}",troll.getAttackPower());

        log.info("ClubbedTroll");
        ClubbedTroll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        log.info("clubbed troll power = {}",clubbedTroll.getAttackPower());


    }
}
