package WhileLoop;

import java.util.Scanner;

public class printNumberFrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number above zero");
        int num = input.nextInt();

        int start = 1;

        while (start <= num) {
            System.out.println(start++);

        }
    }
}
