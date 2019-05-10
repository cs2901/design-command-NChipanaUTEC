package command;

public class StereoOnCommand implements Command {
    Stereo myStereo;

    public StereoOnCommand(Stereo myStereo) {
        this.myStereo = myStereo;
    }

    @Override
    public void execute() {
        myStereo.on();
    }
}
