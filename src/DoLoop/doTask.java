package DoLoop;



import java.util.Random;
import java.util.Scanner;

public class doTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int count = 0;

        do {
            System.out.println("Enter your guess.");
            guess = input.nextInt();
            count++;

            if (guess < randomNumber) {
                System.out.println("Too low.");


            }else if (guess > randomNumber) {
            System.out.println("Too high.");

            }else{
            System.out.println("You guessed right after " + count +  " tries.");
        }
            }while(randomNumber !=guess);

    }
 }
