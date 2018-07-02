package com.noak.design.callback;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-06-27
 */
@Slf4j
public class SimpleTask extends Task {
    @Override
    void execute() {
        log.info("simple task 运行了 execute");
    }
}
