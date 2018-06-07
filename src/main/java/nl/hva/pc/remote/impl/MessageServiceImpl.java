package nl.hva.pc.remote.impl;

import java.util.UUID;

// TODO 03: Change this class to be a "MessageService" implementation
public class MessageServiceImpl {
    public String sendMessage(String msg) {

        System.out.println("Saying " + msg);

        // return the corresponding ID of the new created message
        return UUID.randomUUID().toString();
    }
}