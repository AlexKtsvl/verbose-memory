package IntroToJavaPractice;

import java.util.*;

class CoolNotCool{
    public static void main(String[] args) {

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 3){
            System.out.println("Cool");
        } else {
            System.out.println("Not Cool");
        }

    }
}

