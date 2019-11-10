package StringsSpare;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number");

        String num = input.nextLine();
        String firstNumber = num.substring(0,1);

        boolean invalid = !firstNumber.equals("5") || !firstNumber.equals("2");



        if(invalid){
            System.out.println("invalid account number");

        }else{

        if(firstNumber.equals("5") && num.length() == 10) {
            System.out.println("Valid 5 account");}


        }
        }

    }








// User is asked to enter an account number. You will check if these account numbers are valid.
//    > If the account number begins with a “2” the account number should be 7 characters long
//    > If the account number begins with a “5” the account number should be 10 characters long
//—> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “ Invalid account number”