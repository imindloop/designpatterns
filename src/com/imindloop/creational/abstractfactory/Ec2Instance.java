package com.imindloop.creational.abstractfactory;

public class Ec2Instance implements Instance{

    public Ec2Instance(Capacity capacity) {
        System.out.println("Created EC2 instance");
    }

    @Override
    public void start() {
        System.out.println("Instance Started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to EC2 instance.");
    }

    @Override
    public void stop() {
        System.out.println("EC2 instance stopped");
    }

    @Override
    public String toString() {
        return "Ec2Instance{}";
    }
}
