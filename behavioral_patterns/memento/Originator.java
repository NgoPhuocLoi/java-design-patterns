package behavioral_patterns.memento;

public class Originator {
    String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void changeState(Memento memento) {
        this.state = memento.state;
    }
}
