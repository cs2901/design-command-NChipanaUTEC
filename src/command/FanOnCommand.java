package command;

public class FanOnCommand implements Command {
    Fan ceilingFan;

    public FanOnCommand(Fan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}
