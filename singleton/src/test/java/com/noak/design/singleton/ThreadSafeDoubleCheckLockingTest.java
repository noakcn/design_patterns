package com.noak.design.singleton;

/**
 * @author yeww
 * @since 2018-07-02
 */
public class ThreadSafeDoubleCheckLockingTest extends SingletonTest<ThreadSafeDoubleCheckLocking>{


    public ThreadSafeDoubleCheckLockingTest() {
        super(ThreadSafeDoubleCheckLocking::getInstance);
    }
}
