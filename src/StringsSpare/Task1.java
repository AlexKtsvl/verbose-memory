package StringsSpare;

import java.util.Scanner;

public class Task1 {

    static class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int width = input.nextInt();
            double height = input.nextInt();

            double perimetr = 2*(width + height);
            double area = width + height;

            System.out.println("Area is " + area);
            System.out.println("Perimetr is " + perimetr);

        }
    }
}
