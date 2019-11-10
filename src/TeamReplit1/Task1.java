package TeamReplit1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount, quarters, dimes, nickels,exchange;

        System.out.println("Enter the price in cents: ");
        amount=input.nextInt();

        exchange= 100 - amount;


        quarters=exchange/25;
        exchange=exchange%25;

        dimes=exchange/10;
        exchange=exchange%10;

        nickels=exchange/5;


        System.out.println("Quarters:"+quarters+" Dimes:"+dimes+" Nickels:"+nickels);
    }

}



