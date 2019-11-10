package array;
import java.util.*;
import java.util.Arrays;
class bbbbb {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int days = 0;
        int index = 1;
        System.out.println("Day" + " " + days + " " + Arrays.toString(inhabitants));
        while (index < 9) {
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
            }
            days++;
            System.out.println("Day" + " " + days + " " + Arrays.toString(inhabitants));
            index = 1;
            for (int j = 0; j < inhabitants.length; j++) {
                if (inhabitants[j] == 0)
                    index++;
                for (int k = 3; k < inhabitants.length; k++) {
                    if (inhabitants[k] == 0) {
                        index++;
                    }
                }
            }
        }
    }
}