package nullobject;

//ten pakiet, jest to wzorzec projektowy, w którym dążymy do tego, żeby nie zwracać wartości null
//zamiast tego zwracamy obiekt rozszerzający tą samą klasę abstrakcyjną co właściwy obiekt
//w ten sposób zamiast zwracania wartości "null" zwracamy obiekt o sugestywnej nazwie NullPassenger

public class Main {

    public static void main(String[] args) {
        PassengerFactory factory = new PassengerFactory();

        AbstractPassenger firstPassenger = factory.getPassenger("Joe");
        AbstractPassenger secondPassenger = factory.getPassenger("Jacek");

        System.out.println("First passenger:");
        System.out.println("Name: " + firstPassenger.getName());
        System.out.println("is null? -> " + firstPassenger.isNull());

        System.out.println("\nSecon passenger:");
        System.out.println("Name: " + secondPassenger.getName());
        System.out.println("is null? -> " + secondPassenger.isNull());

    }


}
