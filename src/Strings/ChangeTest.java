package Strings;

import java.util.Scanner;

public class ChangeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = "We will have a picnic when whether gets nicer.";

        System.out.println(word);

        System.out.println("What do you want to change?");

        String change = input.nextLine();

        String replace = input.nextLine();

        String newWord = word.replace(change,replace);

        System.out.println(newWord);




    }
}
