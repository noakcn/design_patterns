package com.noak.design.strategy.member;

/**
 * @author yeww
 * @since 2018-06-27
 */
public interface CalPrice {
    /**
     * 根据原价返回一个最终的价格
     *
     * @param orgnicPice
     * @return
     */
    Double calPrize(Double orgnicPice);
}
