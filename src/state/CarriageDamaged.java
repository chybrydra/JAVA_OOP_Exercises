package state;

public class CarriageDamaged implements CarriageState {


    public void reportPosition(Carriage carriage) {
        System.out.println("wagon jest w naprawie");
    }
}