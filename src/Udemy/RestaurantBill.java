package Udemy;

import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the total?");
        double bill = input.nextDouble();

        System.out.println("How many people?");
        int people = input.nextInt();

        double eachPay = bill/people;


        System.out.format("A bill of £%.2f split between " + people + " people comes to approximately £%.2f each", bill, eachPay);




    }
}
