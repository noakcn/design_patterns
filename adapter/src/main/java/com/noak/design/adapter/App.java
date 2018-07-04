package com.noak.design.adapter;

/**
 * @author yeww
 * @since 2018-07-04
 */
public class App {
    public static void main(String[] args) {
        Caption caption = new Caption(new FishingBoatAdapter());
        caption.row();
    }
}
