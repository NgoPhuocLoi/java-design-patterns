package behavioral_patterns.observer;

public class LogListener implements EventListener {

    @Override
    public void notify(String type, String target) {
        System.out.println("Log Listener: performed %s on file %s".formatted(type, target));
    }

}
