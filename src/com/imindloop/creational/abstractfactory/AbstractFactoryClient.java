package com.imindloop.creational.abstractfactory;

public class AbstractFactoryClient {

    private ResourceFactory resourceFactory;

    public AbstractFactoryClient(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageInMb) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageInMb);

        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args) {
        AbstractFactoryClient awsClient = new AbstractFactoryClient(new AwsResourceFactory());
        Instance i1 = awsClient.createServer(Instance.Capacity.micro, 20840);
        i1.start();
        i1.stop();

        System.out.println("************************************************************");

        AbstractFactoryClient googleClient = new AbstractFactoryClient(new GoogleCloudResourceFactory());
        Instance i2 = googleClient.createServer(Instance.Capacity.small, 5012);
        i2.start();
        i2.stop();

    }


}
