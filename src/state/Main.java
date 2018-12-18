package state;

public class Main {

    public static void main(String[] args) {
        Carriage wagonik = new Carriage.Builder()
                .quickExampleCarriage()
                .state(new CarriageAvailable())
                .build();
        wagonik.reportStatus();

        Carriage drugiWagonik = new Carriage.Builder()
                .quickExampleCarriage()
                .state(new CarriageDamaged())
                .build();
        drugiWagonik.reportStatus();

        Carriage innyWagonik = new Carriage.Builder()
                .quickExampleCarriage()
                .state(new CarriageUnavailable())
                .build();
        innyWagonik.reportStatus();
    }
}
