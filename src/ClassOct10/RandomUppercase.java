package ClassOct10;

import java.util.Random;

public class RandomUppercase {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(26);
        System.out.println("Random number is " + number);
        number += 65;

        char letter = (char)(number);

        System.out.println("Your letter is " + letter);
        System.out.println("Your Number is " + number);





    }
}
