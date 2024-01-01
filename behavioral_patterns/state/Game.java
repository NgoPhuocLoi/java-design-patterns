package behavioral_patterns.state;

public class Game {
    public State state = new WelcomeState(this);

    public void changeState(State state) {
        this.state = state;
    }
}
