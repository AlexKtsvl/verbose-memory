package ReplitTasks;

import java.util.Scanner;

public class MiddleWord {
    public static void main(String[] args) {

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();


        if (word.length() >= 3 && (word.length() % 2) == 0) {
            word.charAt(word.length() / 2 + 1);
            System.out.println(word);


        }
    }
}