package behavioral_patterns.mediator;

public class ChatUser {
    public String name;
    public Mediator mediator;

    public ChatUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println("%s sent message: %s".formatted(name, message));
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println("%s received message: %s".formatted(name, message));
    }
}
