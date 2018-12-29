package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factory usine = new Factory();
        System.out.print("Enter the brand: ");
        Scanner input = new Scanner(System.in);
        String attemptedBrand = input.nextLine();

        String brand = usine.giveACar(attemptedBrand).getBrand();
        String carClass = usine.giveACar(attemptedBrand).getClass().getSimpleName();

        System.out.println("Class: " + carClass + "\nbrand: " + brand);
    }
}
