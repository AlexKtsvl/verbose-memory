package StringsSpare;

import java.util.Scanner;

public class FirstWordToSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen = input.nextLine();


       int space = sen.indexOf(" ");
       int space2 = sen.indexOf(" ", space+1);

       System.out.println(space2);

       String firstWord = sen.substring(0,space);

       String remain = sen.substring(space + 1);

       System.out.println(remain + " " + firstWord);









    }
}
