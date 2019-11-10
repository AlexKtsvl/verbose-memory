package ReplitTasks;

import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        // Your code here
        //------------------------------------------------


        String letter = "x";

        String str1 = n1.substring(0,1);
        String str2 = n1.substring(1,2);
        String str3 = n1.substring(2);

        if(str1.equals(str2) && str2.equals(letter)) {
            System.out.println(str3);
        }else{
            System.out.println();

        if(str1.equals(letter)) {
            System.out.println(str3);
        }

        }

        }
    }

