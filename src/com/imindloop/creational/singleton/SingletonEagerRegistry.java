package com.imindloop.creational.singleton;

public class SingletonEagerRegistry {

    private SingletonEagerRegistry() {
    }

    /**
     *  We initialize the Single and ONLY instance we are going to ever create
     *  this method is private so nobody can create another instance, only the
     *  singleton itself can create it.
     */
    private static final SingletonEagerRegistry INSTANCE = new SingletonEagerRegistry();

    /**
     * a public method to expose the single instance to the outside
     * @return Singleton Instance
     */
    public static SingletonEagerRegistry getInstance() {
        return INSTANCE;
    }



}
