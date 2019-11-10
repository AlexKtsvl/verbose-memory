package IntroToJavaPractice;

import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        int userPass = 3241;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password");
        int num = sc.nextInt();


        if (userPass == userPass)
        {System.out.println("Welcome to iPhone");}

        else if (userPass < 0)
        {System.out.println();}

        else if (userPass < 1000)
        {System.out.println("You entered less digits");}

        else if (userPass > 9999)
        {System.out.println("You entered more digits");}
    }

}














