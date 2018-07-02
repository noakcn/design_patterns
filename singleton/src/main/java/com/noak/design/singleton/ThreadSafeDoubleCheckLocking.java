package com.noak.design.singleton;

/**
 * @author yeww
 * @since 2018-07-02
 */
public final class ThreadSafeDoubleCheckLocking {
    private static volatile  ThreadSafeDoubleCheckLocking instance ;

    private ThreadSafeDoubleCheckLocking() {
        if (instance != null) {
            throw new IllegalStateException("已存在实例");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance(){
        ThreadSafeDoubleCheckLocking result = instance;

        if(result == null){
            synchronized (ThreadSafeDoubleCheckLocking.class){
                result = instance;
                if(result == null){
                    instance = result = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return result;
    }
}
