package builderAlternative1;

public class Train {

    private int locomotivesNumber;
    private int carriagesNumber;
    private int compositionTrack;
    private int destinationTrack;
    private boolean expressTrain;

    /** Overriding default constructor to make it impossible to create Train without builder */
    private Train() {}

    private Train (Builder builder) {
        if (builder == null) {
            return;
        }
        locomotivesNumber = builder.locomotivesNumber;
        carriagesNumber = builder.carriagesNumber;
        compositionTrack = builder.compositionTrack;
        destinationTrack = builder.destinationTrack;
        expressTrain = builder.expressTrain;
    }

    public int getLocomotivesNumber() {
        return locomotivesNumber;
    }

    public int getCarriagesNumber() {
        return carriagesNumber;
    }

    public int getCompositionTrack() {
        return compositionTrack;
    }

    public int getDestinationTrack() {
        return destinationTrack;
    }

    public boolean isExpressTrain() {
        return expressTrain;
    }

    @Override
    public String toString() {
        return "Train{" +
                "locomotivesNumber=" + locomotivesNumber +
                ", carriagesNumber=" + carriagesNumber +
                ", compositionTrack=" + compositionTrack +
                ", destinationTrack=" + destinationTrack +
                ", expressTrain=" + expressTrain +
                '}';
    }

    public static class Builder {

        /** locomotives number cannot be change when building a train */
        private final int locomotivesNumber;

        private int carriagesNumber;

        private int compositionTrack;

        private int destinationTrack;

        private boolean expressTrain;

        public Builder(int locomotivesNumber) {
            if (locomotivesNumber < 1 ) {
                locomotivesNumber = 1;
            }
            this.locomotivesNumber = locomotivesNumber;
        }

        public Builder numberOfCarriages(int carriages) {
            if (carriages < 0) {
                carriages = 0;
            }
            carriagesNumber = carriages;
            return this;
        }

        public Builder composedOnTrack(int compositionTrack) {
            this.compositionTrack = compositionTrack;
            return this;
        }

        public Builder destinationTrack(int destinationTrack) {
            this.destinationTrack = destinationTrack;
            return this;
        }

        public Builder markAsExpress() {
            this.expressTrain = true;
            return this;
        }

        public Train build() {
            return new Train(this);
        }
    }
}