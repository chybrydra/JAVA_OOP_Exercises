package facade;

public class BankomatFacade implements BankomatFacadeInterface {

    private BankSystem bankSystem;
    private BankLogin bankLogin;

    public BankomatFacade(){
        bankSystem = new BankSystem();
        bankLogin = new BankLogin();
    }

    @Override
    public boolean identyfikacja(long numerKarty, int pin){
        boolean correct = false;
        correct = bankLogin.identyfikacja(numerKarty, pin);
        return correct;
    }

    @Override
    public float sprawdzStanKontaBankomat(long nrKarty){
        float stanKonta = 0.00f;
        stanKonta = bankSystem.sprawdzStanKontaBankomat(nrKarty);
        return stanKonta;
    }

    @Override
    public String wyplacGotowke(int kwota){
        return bankSystem.wyplacGotowke(kwota);
    }

}
