package WhileNested;

import java.util.Scanner;

public class WhileCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String checked = "";


        for(int i = 0; i < word.length(); i++){

            int count = 0;

            if(checked.contains(word.charAt(i) + ""))

            for(int j = 0; i < word.length(); i++) {
                if(word.charAt(i) == word.charAt(j)) {
                    count++;
                }
                checked += word.charAt(i) + " ";
            }



            System.out.println(word + " has " + count + " " + word.charAt(i));


        }
    }
}
