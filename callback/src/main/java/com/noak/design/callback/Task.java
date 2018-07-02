package com.noak.design.callback;

/**
 * @author yeww
 * @since 2018-06-27
 */
public abstract class Task {
    public void executeWith(Callback callback) {
        execute();
        if (callback != null) {
            callback.call();
        }
    }

    abstract void execute();

}
