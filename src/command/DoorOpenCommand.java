package command;

public class DoorOpenCommand implements Command{
    Door myDoor;

    public DoorOpenCommand(Door myDoor) {
        this.myDoor = myDoor;
    }

    @Override
    public void execute() {
        myDoor.open();
    }
}

