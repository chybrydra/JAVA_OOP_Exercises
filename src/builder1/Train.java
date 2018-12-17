package builder1;

public class Train {

    private int locomotivesNumber;

    private int carriagesNumber;

    private boolean expressTrain;

    private TrainType trainType;

    public int getLocomotivesNumber() {
        return locomotivesNumber;
    }

    public void setLocomotivesNumber(int locomotivesNumber) {
        this.locomotivesNumber = locomotivesNumber;
    }

    public int getCarriagesNumber() {
        return carriagesNumber;
    }

    public void setCarriagesNumber(int carriagesNumber) {
        this.carriagesNumber = carriagesNumber;
    }

    public boolean isExpressTrain() {
        return expressTrain;
    }

    public void setExpressTrain(boolean expressTrain) {
        this.expressTrain = expressTrain;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    @Override
    public String toString() {
        String express;
        if (expressTrain==true) express = "YES";
        else express = "NO";

        return "Train information: " +
                "\nLocomotives number: " + locomotivesNumber +
                "\nCarriages number: " + carriagesNumber +
                "\nExpress train: " + express +
                "\nTrain type: " + trainType;
    }
}