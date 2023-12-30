package behavioral_patterns.observer;

public class EmailListener implements EventListener {

    @Override
    public void notify(String type, String target) {
        System.out.println("Email Listener: performed %s on file %s".formatted(type, target));
    }

}
