package behavioral_patterns.observer;

public class Editor {
    public EventManager events = new EventManager("open", "save");

    public void open(String file) {
        events.notify("open", file);
    }

    public void save(String file) {
        events.notify("save", file);
    }
}
