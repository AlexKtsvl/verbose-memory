package Strings;

import java.util.Scanner;

public class ComparePractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings");

        String word1 = in.nextLine();
        String word2 = in.nextLine();

        int compare = word1.compareTo(word2);

        if (compare < 0) {
            System.out.println(word1);
        } else if (compare > 0) {
            System.out.println(word2);

        } else {
            System.out.println("Equal");
        }
    }
}

