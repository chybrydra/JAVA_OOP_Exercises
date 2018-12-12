package nullobject;

public class Passenger extends AbstractPassenger {

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
