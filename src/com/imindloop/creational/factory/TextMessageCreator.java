package com.imindloop.creational.factory;

public class TextMessageCreator extends MessageCreator{


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
