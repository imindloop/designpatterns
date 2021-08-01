package com.imindloop.creational.abstractfactory;

public class GoogleCloudStorage implements Storage{

    public GoogleCloudStorage(int capacityInMb) {
        System.out.println("Allocated " + capacityInMb + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "Google Cloud PCS 1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage{}";
    }
}
