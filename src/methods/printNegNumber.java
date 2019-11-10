package methods;

public class printNegNumber {
    public static void main(String[] args) {
        int arr [] = {-1, 3, -4, -2, 32, 2, -23, 1};
        printNegativeNumbers(arr);
    }

    public static void printNegativeNumbers(int [] arr) {
        for(int num: arr) {
            if(num < 0) {
                System.out.println(num);
            }
        }
    }
}
