package d03_behavioral_patterns.p14_command.s02_after;

import d03_behavioral_patterns.p14_command.s01_before.Game;
import d03_behavioral_patterns.p14_command.s01_before.Light;

public class GameStartCommand implements Command {

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
