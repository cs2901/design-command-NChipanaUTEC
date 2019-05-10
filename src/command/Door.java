package command;

public class Door {
    private boolean isOpened = false;
    public void  open(){
        isOpened = true;
        System.out.println("Door opened is "+isOpened);
    }

    public void close(){
        isOpened = false;
        System.out.println("Door opened is "+isOpened);
    }
}
