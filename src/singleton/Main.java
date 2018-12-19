package singleton;

public class Main {

    public static void main(String[] args) {
        ChairmanOffice office = ChairmanOffice.getInstance();
        System.out.println(office.askForRise("Adam"));
        System.out.println(office.askForRise("Adam"));
        System.out.println(office.askForRise("Adam"));
        System.out.println(office.askForRise("Adam"));
        System.out.println(office.askForRise("Adam"));
        System.out.println(office.askForRise("Adam"));

    }

}

