package facade;

public interface BankomatFacadeInterface {
    boolean identyfikacja(long numerKarty, int pin);
    float sprawdzStanKontaBankomat(long nrKarty);
    String wyplacGotowke(int kwota);
}
