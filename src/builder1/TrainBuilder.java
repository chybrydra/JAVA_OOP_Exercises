package builder1;

public abstract class TrainBuilder {

    protected Train train;

    protected abstract void composeTrain();

    public Train build() {
        return train;
    }

}