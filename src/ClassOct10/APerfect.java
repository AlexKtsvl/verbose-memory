package ClassOct10;

import java.util.Scanner;

public class APerfect {
    public static void main(String[] args) {

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        if(n.contains("a") && n.length() >=5 );
          {System.out.println("A Perfect");}

          if (n.contains("b") && n.length() <= 7 && n.length() >= 10);
            {System.out.println("B Perfect");}

    }
}