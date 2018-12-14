package nullobject2;

public class Guest extends AbstractGuest {

    public Guest(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
