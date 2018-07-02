package com.noak.design.factorykit;

import sun.security.provider.Sun;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author yeww
 * @since 2018-07-02
 */
public class Test {

    public static SunPower produce(Supplier<SunPower> supp) {
        return supp.get();
    }

    public static void main(String[] args) {
        SunPower power = new SunPower();
        SunPower p1 = produce(() -> power);
        SunPower p2 = produce(() -> power);

        System.out.println(Objects.equals(p1, p2));
    }
}

class SunPower {
    public SunPower() {
        System.out.println("Sun Power initialized ..");
    }
}