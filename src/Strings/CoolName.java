package Strings;

import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = input.nextLine();

        if ((name.startsWith("a")) || (name.startsWith("A")) || (name.startsWith("z")) || (name.startsWith("Z"))) {

            System.out.println("Your name is cool");
        } else {
            System.out.println("Sorry not a cool name");

        }
    }
}