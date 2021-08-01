package com.imindloop.creational.factory;

public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    //This is the actual Factory Method
    public abstract Message createMessage();
}
