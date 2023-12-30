package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<EventListener>> events = new HashMap<>();

    public EventManager(String... operations) {
        for (String op : operations) {
            events.put(op, new ArrayList<>());
        }
    }

    public void subscribe(String type, EventListener listner) {
        var listeners = events.get(type);
        if (!listeners.contains(listner)) {
            listeners.add(listner);
        }
    }

    public void unsubscribe(String type, EventListener listener) {
        var listeners = events.get(type);
        if (listeners.contains(listener)) {
            listeners.remove(listener);
        }
    }

    public void notify(String type, String data) {
        for (var listener : events.get(type)) {
            listener.notify(type, data);
        }
    }
}
