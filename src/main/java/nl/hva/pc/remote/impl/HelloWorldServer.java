package nl.hva.pc.remote.impl;

import nl.hva.pc.remote.HelloWorldService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// TODO 08: Time to test the server: Run this main method
// TODO 09: Try to run more than once. What's happened? Is it possible to address this issue?
// TODO 14: Restart the server
public class HelloWorldServer {

    public static void main(String[] args) {

        try {
            // TODO 04: Create an instance of HelloWorld
            HelloWorldService helloRemote = new HelloWorldServiceImpl();

            // TODO 05: Generate the stub of this implementation
            HelloWorldService stub = (HelloWorldService) UnicastRemoteObject.exportObject(helloRemote,0);

            // TODO 06: Create the registry running on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // TODO 07: Add the remote object into the registry
            registry.bind("hello",stub);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
