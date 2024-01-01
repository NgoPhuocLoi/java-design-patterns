package behavioral_patterns.mediator;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ChatUser loi = new ChatUser("Loi", mediator);
        ChatUser aris = new ChatUser("Aris", mediator);
        ChatUser cris = new ChatUser("Cris", mediator);

        mediator.addUser(cris).addUser(loi).addUser(aris);

        loi.sendMessage("Hello everyone!");
    }
}