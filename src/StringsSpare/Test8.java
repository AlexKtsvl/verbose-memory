package StringsSpare;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 100.");
        int num = input.nextInt();
        boolean result = num < 100 && num > 0;
        System.out.println(result);


    }

}
