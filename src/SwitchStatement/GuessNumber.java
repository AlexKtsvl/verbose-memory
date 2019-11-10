package SwitchStatement;


import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10);
        randomNumber ++; // this is how I get the range to be 1-10;
        System.out.println("Guess a number ");
        int guessNumber = input.nextInt();

        if(randomNumber == guessNumber)
        {System.out.println("The random number is: " + randomNumber);}
        else if(guessNumber > randomNumber)
        {System.out.println("Too high ");}
        else if(guessNumber  < randomNumber)
        {System.out.println("Too low");}
        else
        {System.out.println();}















    }
}
