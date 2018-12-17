package builder1;

public class CargoTrainBuilder extends TrainBuilder {

    public void composeTrain() {
        train = new Train();
        train.setCarriagesNumber(30);
        train.setLocomotivesNumber(2);
        train.setTrainType(TrainType.CARGO);
    }

    public Train build() {
        composeTrain();
        return train;
    }

}