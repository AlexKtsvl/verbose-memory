package WhileNested;

import java.util.Random;

public class generate {
    public static void main(String[] args) {
//        Random ran = new Random();
//        for (int i = 0; i < 6; i++) {
//        int ranNum = ran.nextInt(10);
//        System.out.print(ranNum);


        Random random = new Random();
        String number = "";  //125
        for(int i=0; i < 6; i++) {
            int ranNum = random.nextInt(10);
//            if(number.contains(ranNum+ "")) {
//                ranNum = random.nextInt(10);
//            }

            while(number.contains(ranNum + "")) {
                ranNum = random.nextInt(10);
            }
            number += ranNum;
        }
        System.out.println(number);
    }
}


