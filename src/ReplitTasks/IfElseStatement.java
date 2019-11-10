package ReplitTasks;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        // Your code here
        //------------------------------------------------


        if (n.contains("a") && n.length() < 5) {
            System.out.println("A Perfect");

        }if (n.contains("a") && n.contains("b") && n.length() > 7 && n.length() <10) {
            System.out.println("B Perfect");

        }if ( n.contains("b")){
            System.out.println("Perfect");


        }if (n.contains("a") && n.length() < 10) {
            System.out.println(" ");

        }else{
            System.out.println("Sorry");
        }

}
}
