package nullobject;

public class PassengerFactory {

    public static final String[] withTickets = {"Rob", "Joe", "Julie"};

    public static AbstractPassenger getPassenger(String name){
        for (int i = 0; i < withTickets.length; i++) {
            if (withTickets[i].equalsIgnoreCase(name)){
                return new Passenger(name);
            }
        }
        // jeśli nie uda się zwrócić właściwego Passengera (nie istnieje w tablicy)
        //to zwrócimy obiekt Null tej samej klasy (AbstractPassenger)
        return new NullPassenger();
    }
}
