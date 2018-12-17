package builder1;

public class Main {

    public static void main(String[] args) {
        CargoTrainBuilder cargoTrain1 = new CargoTrainBuilder();
        cargoTrain1.composeTrain();
        StationMaster master = new StationMaster(cargoTrain1);
        Train myFirstTrain = master.getTrain();

        System.out.println(myFirstTrain.toString());
    }

}
