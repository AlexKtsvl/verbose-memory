package WhileLoop;

import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 1500;
        int transBal;
        int dec = 0;

        while(balance > 0) {
            System.out.println("Enter the transaction amount");
            transBal = input.nextInt();

            if(transBal <= balance) {
                System.out.println("Item purchased");
                balance -= transBal;

            }else{
                System.out.println("Card declined");
                dec++;
            }

            if(dec == 3)
            {
                System.out.println("Card is locked");}
            break;
        }
    }
}

