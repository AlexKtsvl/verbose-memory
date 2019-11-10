package TeamReplit1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words(separate with space):");
        String str3 = input.nextLine();


        //your code here
        //----------------------------------------------------------
        int sum =str3.length();

        System.out.println(sum-1);

        str3 =str3.toLowerCase();

        int space =str3.indexOf(" ");

        System.out.println(str3.substring(0,1).toUpperCase()+str3.substring(1,space) +" "+ str3.substring(space+1,space+2).toUpperCase()+str3.substring(space+2));



        }
    }

