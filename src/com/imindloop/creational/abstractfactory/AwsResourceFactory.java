package com.imindloop.creational.abstractfactory;

public class AwsResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new S3Storage(capacityInMb);
    }
}
