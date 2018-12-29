package facade;

public class BankSystem {

    public float sprawdzStanKontaBankomat(long nrKarty){
        if (nrKarty == 1234567890) {
            return 356.78f;
        } else {
            return 0.00f;
        }
    }

    public String wyplacGotowke(int kwota){
        return "Z konta wyplacono: " + kwota + " PLN";
    }

    public String aktywujKarte(long numerKarty){
        return "Karta " + numerKarty + " aktywna.";
    }

    public void platnoscWeb(){

    }

    public void platnoscInternet(){

    }

    public void wykonajPrzelew(long zKonta, long naKonto, float kwota){

    }

}
