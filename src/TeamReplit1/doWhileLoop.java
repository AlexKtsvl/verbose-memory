package TeamReplit1;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add 1");
        String check = input.nextLine();
        int number = 0;

        while (check.equals("yes") || check.equals("y")) {
            number++;

            System.out.println("Would you like to add 1");
            check = input.nextLine();
        }

        System.out.println("Your number is: " + number);

        int num2 = -1;
        do{
            num2++;
            System.out.println("Would you like to add 1");
            check = input.nextLine();

        } while(check.equals("yes"));


    }
}


//    Write a program to prompt the user to enter the numbers till the user wants (by asking user if he wants to continue)
//    and at the end it should display the count of positive, negative and zeros entered. (Hint: use do while loop)
//
//        Example:
//
//        Input:
//        Enter the number: 9
//        Do you want to continue y/n? y
//        Enter the number: -5
//        Do you want to continue y/n? y
//        Enter the number: 0
//        Do you want to continue y/n? y
//        Enter the number: 66
//        Do you want to continue y/n? n
//
//        Output:
//        Positive numbers: 2
//        Negative numbers: 1
//        Zero numbers: