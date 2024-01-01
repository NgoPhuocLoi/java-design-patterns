package behavioral_patterns.state;

public class WelcomeState extends State {

    public WelcomeState(Game game) {
        super(game);
        System.out.println("-- Game in Welcome State --");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("You're currently on welcome screen!");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingGameState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Not allowed");
    }

    @Override
    public void onEndGame() {
        System.out.println("Not allowed");
    }

}
