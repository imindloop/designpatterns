package com.imindloop.creational.singleton;

/**
 * This Singleton implementation was referenced by Joshua BLoch in the Google I/O conference in 2008
 *
 * It handles serialization using java's in-built mechanism and still ensure single instance
 */
public enum SingletonRegistryEnum {
    /**
     * This is an enum whose unique object is going to be the INSTANCE
     */
    INSTANCE;

    public void getConfiguration() {

    }
}
