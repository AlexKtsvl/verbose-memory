package Oct10Substrings;

import java.util.Scanner;

public class LocatingWord {
    public static void main(String[] args) {
        String str = "Cybertek is located in Des Plaines";

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        int index = str.indexOf(word);

        System.out.println(index);




    }
}
