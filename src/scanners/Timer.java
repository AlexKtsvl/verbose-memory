package scanners;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the minutes:");
        int mins = scanner.nextInt();
        int hours = mins/60;
        int remandingMinutes = mins % 60;

        System.out.println(mins + " minutes is " + hours + " hours and " + remandingMinutes + " minutes");
        scanner.close();


    }
}
