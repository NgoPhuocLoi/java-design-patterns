package behavioral_patterns.observer;

public interface EventListener {
    void notify(String type, String target);
}
