package nl.hva.pc.remote;

// TODO 01: Make this interface remote (java.rmi.Remote)
public interface MessageService {

    // TODO 02: Change the signature of this method, allowing it throw a java.rmi.RemoteException

    // TODO 14: Change the parameter string to nl.hva.pc.common.Message.
    // You will also need to adapt the implementation and the client to pass a Message object instead of a String

    String sendMessage(String msg);
}
