package com.imindloop.creational.abstractfactory;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMb);




}
