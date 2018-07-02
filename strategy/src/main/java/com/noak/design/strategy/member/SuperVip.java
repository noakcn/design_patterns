package com.noak.design.strategy.member;

import com.noak.design.strategy.member.annotation.PriceRegion;

/**
 * @author yeww
 * @since 2018-06-27
 */
@PriceRegion(min = 20000, max = 30000)
public class SuperVip implements CalPrice {
    @Override
    public Double calPrize(Double orgnicPice) {
        return orgnicPice * 0.8;
    }
}
