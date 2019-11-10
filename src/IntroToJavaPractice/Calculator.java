package IntroToJavaPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two doubles");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        input.nextLine();

        System.out.println("Choose operator: + - * /");
        String operator = input.nextLine();

        switch (operator) {
            case "*":
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " is: " + (num1 * num2));
                break;
            case "-":
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " is: " + (num1 - num2));
                break;
            case "+":
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " is: " + (num1 + num2));
                break;
            case "/":
                System.out.println("Result of " + num1 + " " + operator + " " + num2 + " is: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator entered. Please try again");
                break;
        }
    }
}



