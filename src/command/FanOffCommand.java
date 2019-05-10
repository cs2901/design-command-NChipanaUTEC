package command;

public class FanOffCommand implements Command {
    Fan ceilingFan;

    public FanOffCommand(Fan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}