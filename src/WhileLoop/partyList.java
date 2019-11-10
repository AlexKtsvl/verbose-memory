package WhileLoop;

import java.util.Scanner;

public class partyList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add 1");
        String check = input.nextLine();

        int names = 0;

        while (check.equals("yes") || check.equals("y")) {
            names++;

            System.out.println("Would you like add 1");
            check = input.nextLine();
        }

        System.out.println("Your number is: " + names);

    }
}
