package methods;

import java.util.Scanner;

public class numberOfWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        countWords(str);
    }
    public static void countWords (String str) {
        String[] arr = str.trim().split(" ");
        System.out.println(arr.length);

    }
}
