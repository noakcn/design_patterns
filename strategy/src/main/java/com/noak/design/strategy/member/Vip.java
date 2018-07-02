package com.noak.design.strategy.member;

import com.noak.design.strategy.member.annotation.PriceRegion;

/**
 * @author yeww
 * @since 2018-06-27
 */
@PriceRegion(max = 20000,min = 10000)
public class Vip implements CalPrice {
    @Override
    public Double calPrize(Double orgnicPice) {
        return orgnicPice * 0.9;
    }
}
