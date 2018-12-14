package nullobject;

public class NullPassenger extends AbstractPassenger {

    public NullPassenger() {
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "NULL PASSENGER";
    }
}