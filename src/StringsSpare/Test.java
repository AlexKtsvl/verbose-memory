package StringsSpare;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String givenName = scanner.nextLine();

        System.out.println("What is your gender?");
        char givenGender = scanner.next().charAt(0);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is your phone number?");
        long phoneNum = scanner.nextLong();

        System.out.println("What is your GPA?");
        double GPA = scanner.nextDouble();

        System.out.println("Name: " + givenName);
        System.out.println("Gender: " + givenGender);
        System.out.println("Age: " + age);
        System.out.println("Tel: " + phoneNum);
        System.out.println("GPA: " + GPA);







    }
}
