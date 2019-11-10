package Udemy;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.print("Please enter height: ");
        int height = input.nextInt();

        if(height < 130 || height > 210) {
            System.out.println("Not accepted");

        }else {
            System.out.println("Accepted");
        }




    }
}
