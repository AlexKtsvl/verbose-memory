package ForLoop;

import java.util.Scanner;

public class PasswordAccess {
    public static void main(String[] args) {
        System.out.println("Enter password:");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        String password = "secret478";

        if (userInput.equals(password)) {
            System.out.println("Welcome User!");
        } else {
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter password:");
                userInput = input.nextLine();

                if (userInput.equals(password)) {
                    System.out.println("Welcome to your profile.");
                }
                System.out.println();
            }
            System.out.println("Access Denied!");

            }
        }
    }









