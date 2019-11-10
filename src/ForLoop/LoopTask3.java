package ForLoop;

import java.util.Scanner;

public class LoopTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        for (int i = 1; i <= 6; i++){

            String name = input.nextLine();
            System.out.println("Enter a name " + i);
            System.out.println(name);

        }
    }
}
