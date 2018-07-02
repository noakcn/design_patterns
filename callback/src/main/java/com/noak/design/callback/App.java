package com.noak.design.callback;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-06-27
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        SimpleTask simpleTask = new SimpleTask();
        simpleTask.executeWith(() -> log.info("运行回调"));
    }
}
