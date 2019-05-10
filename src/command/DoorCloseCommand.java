package command;

public class DoorCloseCommand implements Command {
    Door myDoor;

    public DoorCloseCommand(Door myDoor) {
        this.myDoor = myDoor;
    }

    @Override
    public void execute() {
        myDoor.close();
    }
}
