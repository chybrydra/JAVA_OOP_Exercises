package builder1;

public class StationMaster {

    private TrainBuilder trainBuilder;

    public StationMaster(TrainBuilder trainBuilder) {
        this.trainBuilder = trainBuilder;
    }

    public void setTrainBuilder(TrainBuilder trainBuilder) {
        this.trainBuilder = trainBuilder;
    }

    public Train getTrain() {
        return trainBuilder.build();
    }

}