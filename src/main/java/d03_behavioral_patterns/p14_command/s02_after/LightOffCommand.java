package d03_behavioral_patterns.p14_command.s02_after;

import d03_behavioral_patterns.p14_command.s01_before.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }
}
