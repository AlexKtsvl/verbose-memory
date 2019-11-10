package ForLoop;

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double i, s = 0.0;
        for (i = 1; i <= n; i++)
            s = s + 1 / i;


        System.out.printf("Sum is %f",(n));


    }
}

