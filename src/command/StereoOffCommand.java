package command;

public class StereoOffCommand implements Command {
    Stereo myStereo;

    public StereoOffCommand(Stereo myStereo) {
        this.myStereo = myStereo;
    }

    @Override
    public void execute() {
        myStereo.off();
    }
}
