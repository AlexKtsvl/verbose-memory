package ifElseStatements;


import java.util.*;

class StringA {
    public static void main(String[] args) {

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        // Your code here
        //------------------------------------------------



        if(n.contains("a") && n.length()<5){
            System.out.println("A Perfect");
        }
        if(n.contains("b"));{
            System.out.println("jabs");
        }

    }
}

//public static void main(String[] args) {
//        System.out.println(5 > 4 && 6 > 4 && false);
//        System.out.println(4 < 3 || true);
//
//        boolean b = 5 > 1;
//        boolean d = false;
//        boolean check = d || b;
//        boolean check2 = d && b;
//        System.out.println(b);
//        System.out.println(check);
//        System.out.println(check2);
//
//        int age = 5;
//        int age2 = 6;
//        boolean ageB = age == age2;
//        System.out.println();