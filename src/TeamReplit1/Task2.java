package TeamReplit1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long units;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of units");

        units=sc.nextLong();

        double billpay = 0;

        if(units<100)
            billpay = units*1.20;

        else if(units<300)
            billpay = 100*1.20+(units-100)*2;

        else if(units>300)
            billpay = 100*1.20+200 *2+(units-300)*3;

        System.out.println("Bill to pay : " + billpay);
    }
}


