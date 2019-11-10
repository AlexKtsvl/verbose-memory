package ReplitTasks;

import java.util.*;

class substring {
    public static void main(String[] args) {


        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        // Your code here
        //------------------------------------------------

        String n2 = n1.substring(1);

        if(n1.startsWith("x") && n1.contains("x")){
            System.out.println(n2);
        }else{
            System.out.println(n1);
        }



    }

    }
