package nullobject2;

import java.util.ArrayList;
import java.util.List;

//słaby przykład, spróbuję wymyślić jeszcze inny, lepszy

public class Main {

    public static void main(String[] args) {

        List<AbstractGuest> peopleWhoCameIn = new ArrayList<>();

        List<String> guestList = new ArrayList<>(); //lista zaproszonych
        GuestVerification verificator = new GuestVerification(guestList); //weryfikator gości
        guestList.add("Adam");
        guestList.add("Bartosz");
        guestList.add("Ewelina");
        guestList.add("Beata");

        Person personComing1 = new PersonControlled("Bartosz"); //pierwsza osoba, która chce wejść na przyjęcie
        Person personComing2 = new PersonControlled("Ewa"); //druga osoba, która chce wejść na przyjęcie
        Person personComing3 = new PersonControlled("Kajko"); //druga osoba, która chce wejść na przyjęcie
        Person personComing4 = new PersonControlled("Ewelina"); //druga osoba, która chce wejść na przyjęcie
        Person personComing5 = new PersonControlled("Adam"); //druga osoba, która chce wejść na przyjęcie


        peopleWhoCameIn.add(verificator.verifyGuest(personComing1));
        peopleWhoCameIn.add(verificator.verifyGuest(personComing2));
        peopleWhoCameIn.add(verificator.verifyGuest(personComing3));
        peopleWhoCameIn.add(verificator.verifyGuest(personComing4));
        peopleWhoCameIn.add(verificator.verifyGuest(personComing5));

        System.out.println("People who came in:");
        for (AbstractGuest guest : peopleWhoCameIn){
            if(guest.isNull()){
                //tutaj nic nie wykonuje
                //zanotowałem ile osób próbowało wejść na przyjęcie,
                //ale na liście wyświetlam tylko osoby które faktycznie weszły
            } else {
                System.out.println("-" + guest.getName());
            }
        }
    }

}
