package command;

public class LightOffComand implements Command {
    Light light;

    public LightOffComand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}