package facade;

public class BankLogin {

    public boolean identyfikacja(long numerKarty, int pin){
        if (numerKarty == 1234567890 && pin == 1234){
            return true;
        } else {
            return false;
        }
    }

    public void identyfikacjaWeb(String id, String haslo){

    }

    public void identyfikacjaKomorka(){

    }

}
