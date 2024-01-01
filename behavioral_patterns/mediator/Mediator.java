package behavioral_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<ChatUser> users = new ArrayList<>();

    public Mediator addUser(ChatUser user) {
        this.users.add(user);
        return this;
    }

    public void sendMessage(String message, ChatUser sender) {
        for (ChatUser chatUser : users) {
            if (!chatUser.equals(sender)) {
                chatUser.receiveMessage(message);
            }
        }
    }
}
