package Oct10Substrings;

import java.util.Scanner;

public class MonthLocating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = "October";
        System.out.println("Enter the month");
        String user = input.nextLine();
        boolean check = user.equalsIgnoreCase(month);
        System.out.println(check);
//        String month1 = user.toLowerCase();
//        System.out.println(month1.equals("october"));
    }
}
