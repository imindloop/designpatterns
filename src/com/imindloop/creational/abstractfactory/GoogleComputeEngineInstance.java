package com.imindloop.creational.abstractfactory;

public class GoogleComputeEngineInstance implements Instance{

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine Instance Started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google Compute instance.");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine instance stopped");
    }

    @Override
    public String toString() {
        return "Google Compute Engine Instance{}";
    }
}
