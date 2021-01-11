package homework7;

/**
 * Created by Gohar Farmanyan
 */

public class Api {
    public void doSomething(Status status) {
        if (status == Status.NOT_STARTED) {
            System.out.println("Need to start");
        } else if (status == Status.PENDING) {
            System.out.println("Start preparing");
        } else if (status == Status.IN_PROGRESS) {
            System.out.println("Continue working");
        } else if (status == Status.DONE || status == Status.RESOLVE) {
            System.out.println("Close the tickets");
        }
    }


}
