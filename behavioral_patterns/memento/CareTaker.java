package behavioral_patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementos = new ArrayList<>();

    public void saveState(Memento memento) {
        mementos.add(memento);
    }

    public Memento getState(int index) {
        return mementos.get(index);
    }
}
