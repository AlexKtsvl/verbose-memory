package methods;
import java.util.Scanner;
import java.util.Arrays;

public class overloading {
    public static void main(String[] args) {
        jump();
        jump(5);
        jump("nike");
        String [] arr = {"d"};
        System.out.println(jump(arr));

    }

    public static void jump () {
        System.out.println("You don't get far");

    }

    public static void jump (String shoes) {
        System.out.println("The shoes made you go farther");

    }

    public static void jump (int distance) {
        System.out.println("You jumped " + distance + "m");

    }

    public static String jump (String [] arr) {
        return "jumped by array";


    }
}


