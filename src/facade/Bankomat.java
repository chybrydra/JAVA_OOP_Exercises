package facade;

/*
jest to wersja demo, nie działa w sposób docelowy
gdyż wszystkie elementy są w jednym pakiecie,
tzn tutaj Bankomat może sobie utworzyć instancję klasy BankSystem,
w rzeczywistości by nie mógł, bo by jej nie widział, byłaby ona częścią innego projektu

W rzeczywistości mielibyśmy 3 projekty.
Pierwszym projektem byłby projekt systemu bankowego,
drugim sama fasada, a trzecim bankomat.
Fasada udostępnia projektowi bankomatu odpowiednie,
tak żeby bankomat nie miał dostępu do reszty
metod systemu bankowego
 */

import java.util.Scanner;

public class Bankomat {

    private BankomatFacade bankomatFacade = new BankomatFacade();
    private static Bankomat bankomat = new Bankomat();

    public static void main(String[] args) {
        bankomat.bankomatStart();
    }

    public void bankomatStart(){
        int pin = 0;
        boolean autoryzacja = false;

        System.out.println("=== WITAJ W BANKOMACIE RZETELNEGO BANKU!! ===\n");
        System.out.println("=== Włóż kartę i podaj pin jak nie dygasz ===\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Kod PIN: ");
        pin = input.nextInt();

        System.out.println("Autoryzacja...\n");

        autoryzacja = bankomatFacade.identyfikacja(1234567890, pin);
        if (autoryzacja) {
            bankomat.pokazMenu();
        } else {
            System.out.println("Autoryzacja nie powiodła się! Karta została zatrzymana.");
            bankomat.koniec();
        }
    }

    public void pokazMenu(){
        System.out.println("==== MENU ====");
        System.out.println("1. Stan konta");
        System.out.println("2. Wyplata gotówki");
        System.out.println("3. Wyjście");

        System.out.print("Wybierz: ");
        Scanner input = new Scanner(System.in);
        int wybor = input.nextInt();

        switch(wybor){
            case 1:
                bankomat.pokazStanKonta(1234567890);
                break;
            case 2:
                bankomat.wyplacGotowke(260);
                break;
            case 3:
                bankomat.koniec();
                break;
            default:
                bankomat.pokazMenu();
        }
    }

    public void pokazStanKonta(long nrKarty){
        System.out.println(bankomatFacade.sprawdzStanKontaBankomat(nrKarty));
        bankomat.pokazMenu();
    }

    public void wyplacGotowke(int kwota){
        String wyplata = bankomatFacade.wyplacGotowke(kwota);
        System.out.println(wyplata);
        System.out.println("Odbierz kartę.");
        bankomat.koniec();
    }

    public void koniec(){
        System.exit(0);
    }

}
