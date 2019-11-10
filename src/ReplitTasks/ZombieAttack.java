package ReplitTasks;

import java.util.Scanner;

public class ZombieAttack {
    public static void calc(int[] arr) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        for(int i = 1; i < arr.length; i++)
            if(arr[i] > 0 && arr[i - 1] == 0)
                arr[i] /= -2;

        for(int i = arr.length - 2; i >= 0; i--)
            if(arr[i] < 0)
                arr[i] = -arr[i];
            else if(arr[i] > 0 && arr[i + 1] == 0)
                arr[i] /= 2;
    }

}
