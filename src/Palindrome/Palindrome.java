package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String word = input.nextLine();

        String back = "";

        for(int i = word.length()-1; i >= 0; i--) {
            back += word.charAt(i);
        }
        System.out.println(word);

        if(word.equals(back)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
