package d03_behavioral_patterns.p14_command.s02_after;

import d03_behavioral_patterns.p14_command.s01_before.Game;
import d03_behavioral_patterns.p14_command.s01_before.Light;

import java.util.Stack;

public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }

}
