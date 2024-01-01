package behavioral_patterns.state;

public class PlayingGameState extends State {

    public PlayingGameState(Game game) {
        super(game);
        System.out.println("-- Game in Playing State --");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not allowed!");
    }

    @Override
    public void onPlaying() {
        System.out.println("You're currently in playing state");
    }

    @Override
    public void onBreak() {
        game.changeState(new BreakState(game));
    }

    @Override
    public void onEndGame() {
        game.changeState(new EndGameState(game));
    }

}
