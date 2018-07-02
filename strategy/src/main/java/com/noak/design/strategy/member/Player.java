package com.noak.design.strategy.member;

import lombok.Getter;

/**
 * @author yeww
 * @since 2018-06-27
 */
public class Player {
    @Getter
    private Double totalAmount = 0D;
    private Double amount = 0D;
    private CalPrice calPrize;

    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        calPrize = CalPriceFactory.getInstance().createCalPrize(this);
    }

    public Double calLastAmount() {
        return calPrize.calPrize(this.amount);
    }

}
