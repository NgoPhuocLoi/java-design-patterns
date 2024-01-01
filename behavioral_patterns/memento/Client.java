package behavioral_patterns.memento;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("Initial state");

        careTaker.saveState(originator.createMemento());
        System.out.println("Current state: %s".formatted(originator.state));

        originator.state = "State 1";
        careTaker.saveState(originator.createMemento());
        System.out.println("Current state: %s".formatted(originator.state));

        originator.state = "State 2";
        careTaker.saveState(originator.createMemento());
        System.out.println("Current state: %s".formatted(originator.state));

        originator.changeState(careTaker.getState(0));
        System.out.println("Current state: %s".formatted(originator.state));
    }
}
