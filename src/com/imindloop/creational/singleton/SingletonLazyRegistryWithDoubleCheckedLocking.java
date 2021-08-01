package com.imindloop.creational.singleton;

/**
 * Singleton design pattern using double checked locking or "Classic" Singleton.
 */
public class SingletonLazyRegistryWithDoubleCheckedLocking {

    private SingletonLazyRegistryWithDoubleCheckedLocking() {
    }

    /**
     * The volatile word in this case allows us to make sure that threads using the INSTANCE
     * are not using a stale version in the cache, so they can always use the latest Singleton version.
     */
    private static volatile SingletonLazyRegistryWithDoubleCheckedLocking INSTANCE;

    public static SingletonLazyRegistryWithDoubleCheckedLocking getInstance() {
        if (null == INSTANCE) {
            /**
             * If we have threads and we don't synchronize we could end up with 2 instances :(
             *
             * This line is a stop and wait point for threads, so after this we need to check again
             * if the INSTANCE is null, so we can make sure waiting threads are not creating a duplicated Singleton
             * instance.
             * THIS IS WHAT IS ACTUALLY CALLED DOUBLE CHECKED LOCKING. because we are checking twice whether
             * there was a locked instance around.
             */
            synchronized (SingletonLazyRegistryWithDoubleCheckedLocking.class) {
                if (null == INSTANCE) {
                    INSTANCE = new SingletonLazyRegistryWithDoubleCheckedLocking();
                }
            }
        }
        return INSTANCE;
    }
}
