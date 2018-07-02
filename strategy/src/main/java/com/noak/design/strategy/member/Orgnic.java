package com.noak.design.strategy.member;

import com.noak.design.strategy.member.annotation.PriceRegion;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-06-27
 */
@Slf4j
@PriceRegion(max = 10000)
public class Orgnic implements CalPrice {
    @Override
    public Double calPrize(Double orgnicPice) {
        return orgnicPice ;
    }
}
