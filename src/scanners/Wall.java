package scanners;

import java.util.Scanner;

public class Wall {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the wall color?");
        String color = input.nextLine();

        System.out.println("What is the lenght");
        int lenght = input.nextInt();
        input.nextLine();

        System.out.println("Is this good one?");
        String answer = input.nextLine();

        System.out.println("Color: " + color);
        System.out.println("Length: " + lenght);
        System.out.println("Good?: " + answer);

    }


}
