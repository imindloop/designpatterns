package com.imindloop.creational.singleton;

public class SingletonLazyRegistryInitializationHolder {

    private SingletonLazyRegistryInitializationHolder() {
        System.out.println("The Singleton Lazy Registry Initialization Holder Constructor was called");
    }

    private static class RegistryHolder {
        static SingletonLazyRegistryInitializationHolder INSTANCE = new SingletonLazyRegistryInitializationHolder();
    }

    public static SingletonLazyRegistryInitializationHolder getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
