package ReplitTasks;

import java.util.Scanner;

public class LoopEx7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

       String str1 = word.substring(0,1);
       String str2 = word.substring(1,2);
       String str3 = word.substring(2);

       if(str1.equals(str2) && str2.equals("x")) {
           System.out.println(str3);
        }else{
           System.out.println();
       }

        }
    }
    //
//        Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s).
//                If x is the third letter it should be printed. If the first and second are x, both should be ignored.
//                Input:
//        xxode
//
//        Output:
//        ode
//
//
//        Input:
//        oxidex
//
//        Output:
//        oidex

        // String p2 = n1.substring(n1.length()/2, n1.length()/2+1);
// // String p3 = n1.substring(n1.length()/2+1);
// if (n1.length()%2==1 && n1.length()>3){
// System.out.println(p2);
// }else{
// System.out.println(“”);





