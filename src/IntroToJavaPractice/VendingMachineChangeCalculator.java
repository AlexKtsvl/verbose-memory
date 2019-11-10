package IntroToJavaPractice;

import java.util.Scanner;

public class VendingMachineChangeCalculator {
    public static void main(String[] args) {
        Scanner takeit = new Scanner(System.in);
        System.out.println("Enter a whole number from 1 to 99"
                + "\nI will find a combination of coins that equals"
                +"the amount of change ");
        int money = 0;
        System.out.println("Please enter number: ");
        money = takeit.nextInt();

        if(money>0 && money<=99) {
            System.out.println("You have: ");

            int quarter, dime, nickel, penny;

            quarter = money/25;
            money = money %25;

            dime = money/10;
            money = money %10;

            nickel = money/5;
            money = money%5;
            penny = money;

            System.out.println(quarter + " quarters");
            System.out.println(dime + " dimes");
            System.out.println(nickel + " nickles");
            System.out.println(penny + " pennies");

            System.out.print("Good job, enter a new valid integer: ");
            money = takeit.nextInt();
        }
        else  {System.out.print("Invalid entry, please try again: ");
            money = takeit.nextInt();
        }
        takeit.close();
    }
}
