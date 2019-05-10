package command;

public class RemoteControl {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light LivingLight = new Light();
        Light KitchenLight = new Light();
        Fan CeilingFan = new Fan();
        Door GarageDoor = new Door();
        Stereo myStereo = new Stereo();
        LightOnCommand LivinglightOn = new LightOnCommand(LivingLight);
        LightOffComand LivinglightOff = new LightOffComand(LivingLight);
        LightOnCommand KitchenlightOn = new LightOnCommand(KitchenLight);
        LightOffComand KitchenlightOff = new LightOffComand(KitchenLight);
        FanOnCommand CeilingFanOn = new FanOnCommand(CeilingFan);
        FanOffCommand CeilingFanOff = new FanOffCommand(CeilingFan);
        DoorOpenCommand GarageOpen = new DoorOpenCommand(GarageDoor);
        DoorCloseCommand GarageClose = new DoorCloseCommand(GarageDoor);
        StereoOnCommand StereoOn = new StereoOnCommand(myStereo);
        StereoOffCommand StereoOff = new StereoOffCommand(myStereo);

        System.out.println("Living Room");
        remote.setCommand(LivinglightOn);
        remote.buttonWasPressed();
        remote.setCommand(LivinglightOff);
        remote.buttonWasPressed();

        System.out.println("\nKitchen");
        remote.setCommand(KitchenlightOn);
        remote.buttonWasPressed();
        remote.setCommand(KitchenlightOff);
        remote.buttonWasPressed();

        System.out.println("\nCeiling Fan");
        remote.setCommand(CeilingFanOn);
        remote.buttonWasPressed();
        remote.setCommand(CeilingFanOff);
        remote.buttonWasPressed();

        System.out.println("\nGarage Door");
        remote.setCommand(GarageOpen);
        remote.buttonWasPressed();
        remote.setCommand(GarageClose);
        remote.buttonWasPressed();

        System.out.println("\nStereo");
        remote.setCommand(StereoOn);
        remote.buttonWasPressed();
        remote.setCommand(StereoOff);
        remote.buttonWasPressed();
    }
}
