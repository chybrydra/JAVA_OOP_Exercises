package state;

public class CarriageAvailable implements CarriageState {


    public void reportPosition(Carriage carriage) {
        System.out.println("wagon rozporządzalny oczekuje na bocznicy : " + carriage.getSidingNumber() + " na torze " + carriage.getTrack());
    }
}