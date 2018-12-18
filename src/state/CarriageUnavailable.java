package state;

public class CarriageUnavailable implements CarriageState {

    public void reportPosition(Carriage carriage) {
        System.out.println("wagon jest niedostepny - w trakcie realizacji przewozu");
    }
}