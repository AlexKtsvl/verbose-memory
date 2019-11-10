package IntroToJavaPractice;

public class NestedIfs {
    public static void main(String[] args) {

        int number = 30;

        if (number >= 0 && number <= 50) {

            if (number >= 10 && number <= 10) {

            }else{
                System.out.println();


                System.out.println("Not in the 10 - 40 range");
            }


        } else {
            System.out.println("Not in the range");
        }
    }
}
