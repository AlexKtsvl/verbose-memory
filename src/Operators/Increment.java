package Operators;

public class Increment {
    public static void main(String[] args) {
        int age = 5;

        //age +=6;
        //age = age + 6;


        //
        // age += 1;
       // age++;
       //
        // ++age;

        System.out.println(age); //5
        System.out.println(++age); //6
        System.out.println(age++); // after > 7
        System.out.println(age); //

        int x =11;
        //int y = x++; //int y = 11; then x increments
        int y = x;
        x++;

        //int count = 0;
        //count++;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println(y);







    }
}
