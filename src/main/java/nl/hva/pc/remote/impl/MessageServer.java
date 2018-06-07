package nl.hva.pc.remote.impl;

// TODO 08: Time to test the server: Run this main method.
// Why the application keeps running even after running the main method?

// TODO 09: Try to run more than once
// What's happened? Is it possible to address this issue?

// TODO 14.1: Restart the server
public class MessageServer {

    public static void main(String[] args) {

        try {
            // TODO 04: Create an instance of MessageService

            // TODO 05: Generate the stub of this implementation
            // use the method UnicastRemoteObject.exportObject(<ref>,0) to generate the stub

            // TODO 06: Create the registry running on port 1099
            // you can use the method createRegistry of LocateRegistry

            // TODO 07: Add the remote object into the registry
            // you can use the method bind of the registry object

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
