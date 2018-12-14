package nullobject2;

import java.util.List;

public class GuestVerification {

    List<String> guestList;

    public GuestVerification(List<String> guestList) {
        this.guestList = guestList;
    }

    public AbstractGuest verifyGuest(Person person){
        for (String listValue : guestList){
            if (listValue.equals(person.getName())){
                return new Guest(person.getName());
            }
        }
        return new GuestNull();
    }

}
