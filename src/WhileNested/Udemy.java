package WhileNested;

import java.util.Scanner;

public class Udemy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");

        int age = input.nextInt();
        System.out.println("You have lived " + age + " years. " + "In another " + age + " years you will be " + (2*age) + " years old.");


        System.out.println("What is your name?");
        input.nextLine();


        String name = input.nextLine();
        System.out.println("Your name is: " + name.trim());
        System.out.println("Name length: " + name.trim().length());
    }
}
