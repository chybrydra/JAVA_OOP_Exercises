package state;

public class Carriage {

    private String number;
    private String track;
    private String sidingNumber;
    private CarriageState state;

    private Carriage(){ }

    private Carriage(Builder builder){
        number = builder.number;
        track = builder.track;
        sidingNumber = builder.sidingNumber;
        state = builder.state;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getSidingNumber() {
        return sidingNumber;
    }

    public void setSidingNumber(String sidingNumber) {
        this.sidingNumber = sidingNumber;
    }

    public CarriageState getState() {
        return state;
    }

    public void setState(CarriageState state) {
        this.state = state;
    }

    public void reportStatus() {
        if (state != null) {
            state.reportPosition(this);
        } else {
            System.out.println("status unknown");
        }
    }

    public static class Builder {

        private String number;
        private String track;
        private String sidingNumber;
        private CarriageState state;

        public Builder quickExampleCarriage() {
            this.track = "1";
            this.sidingNumber = "BOC-123";
            this.number = "112";
            return this;
        }

        public Builder state(CarriageState state) {
            this.state = state;
            return this;
        }

        public Carriage build() {
            Carriage carriage = new Carriage();
            carriage.setNumber(number);
            carriage.setSidingNumber(sidingNumber);
            carriage.setTrack(track);
            carriage.setState(state);
            return carriage;
        }
    }
}