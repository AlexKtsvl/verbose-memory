package ForLoop;

import java.util.Scanner;

public class LoopsTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();


        for (int i = 0; i < 3; i++) {
            if (in.equals("hi")) {
                System.out.println("Hello");
                break;

            }if (in.equals("bye")) {
                System.out.println("Good bye");
                break;

            }if(in.equals("james")){
                System.out.println("Good bye");
                break;

            }else{
                System.out.println("Invalid ");
            }
        }

    }
}

