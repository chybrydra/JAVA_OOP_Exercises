package nullobject2;

public class GuestNull extends AbstractGuest {

    public GuestNull() {
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Guy who was rejected";
    }
}
