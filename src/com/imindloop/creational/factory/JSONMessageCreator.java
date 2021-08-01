package com.imindloop.creational.factory;

public class JSONMessageCreator extends MessageCreator{


    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
