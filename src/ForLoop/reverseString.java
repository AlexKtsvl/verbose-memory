package ForLoop;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));

        }
    }
}


