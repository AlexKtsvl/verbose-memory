package Operators;

public class Increment2 {

    public static void main(String[] args) {

        int book = 10;

        System.out.println(book++); // 10 is printed then incremented ->11
        System.out.println(++book); // 11 increments -> 12, then it prints

        System.out.println(book); //12

        System.out.println(book--); // 12 is printed, then it decreased -> 11
        System.out.println(--book);

        System.out.println(book); //10

    }
}
