package com.imindloop.creational.singleton;

public class SingletonClient {

    public static void main(String[] args) {

        SingletonEagerRegistry singleton = SingletonEagerRegistry.getInstance();

        /**
         * It doesn't matter how many times we retrieve the instance, it is always
         * going to be the same single instance
         */
        SingletonEagerRegistry singleton1000 = SingletonEagerRegistry.getInstance();

        System.out.println(singleton == singleton1000);

        System.out.println("**********************************************************");

        SingletonLazyRegistryWithDoubleCheckedLocking lazySingleton = SingletonLazyRegistryWithDoubleCheckedLocking.getInstance();
        SingletonLazyRegistryWithDoubleCheckedLocking lazySingleton2 = SingletonLazyRegistryWithDoubleCheckedLocking.getInstance();

        System.out.println(lazySingleton == lazySingleton2);

        System.out.println("**********************************************************");

        SingletonLazyRegistryInitializationHolder initializationHolderSingleton;

        System.out.println("Done");

        initializationHolderSingleton = SingletonLazyRegistryInitializationHolder.getInstance();

        System.out.println(initializationHolderSingleton);

        System.out.println("Done 2");

        initializationHolderSingleton = SingletonLazyRegistryInitializationHolder.getInstance();
        initializationHolderSingleton = SingletonLazyRegistryInitializationHolder.getInstance();
        initializationHolderSingleton = SingletonLazyRegistryInitializationHolder.getInstance();
        initializationHolderSingleton = SingletonLazyRegistryInitializationHolder.getInstance();

        System.out.println("Done 3");


    }
}
