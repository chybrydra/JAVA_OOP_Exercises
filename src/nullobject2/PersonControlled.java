package nullobject2;

public class PersonControlled implements Person {

    String name;

    public PersonControlled(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
