package com.noak.design.strategy.member;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-06-27
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.buy(500D);
        log.info("实际需支付：{}", player.calLastAmount());

        player.buy(12000D);
        log.info("实际需支付：{}", player.calLastAmount());

        player.buy(12000D);
        log.info("实际需支付：{}", player.calLastAmount());

        player.buy(12000D);
        log.info("实际需支付：{}", player.calLastAmount());

    }
}
