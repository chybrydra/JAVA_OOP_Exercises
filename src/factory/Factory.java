package factory;

public class Factory {

    public Cars giveACar(String brand){
        Cars car;
        if (brand.equals("fiat")){
            car = new Fiat();
        } else if (brand.equals("ford")){
            car = new Ford();
        } else if (brand.equals("mercedes")){
            car = new Mercedes();
        } else {
            car = new Cars();
        }
        return car;
    }

}
