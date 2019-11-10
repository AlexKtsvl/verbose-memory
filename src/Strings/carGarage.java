package Strings;

import java.util.Scanner;

public class carGarage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);




        String cars = "Toyota, BMW, Jaguar, Maserati";
        cars = cars.toLowerCase();

        if (cars.isEmpty()) {
            System.out.println("Garage is empty");
        }
        if (cars.contains("toyota")) {
            System.out.println("There is a Japanese car in your garage");
        }else{
            System.out.println("There is no Japanese cars in your garage");
        }
        if (cars.contains("bmw")) {
            System.out.println("There is a German car in your garage");
        }else{
            System.out.println("there is no German cars in your garage");
        }
        if (cars.contains("maserati")) {
            System.out.println("There is a Italian car in your garage");
        }else{
            System.out.println("There is no Italian cars in your garage");
        }
        if (cars.contains("jaguar")) {
            System.out.println("There is a British car in your garage");
        }else{
            System.out.println("There is no british car in your garage");
        }
    }

}
