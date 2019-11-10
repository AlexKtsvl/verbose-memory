package ForLoop;

public class Lesson {
    public static void main(String[] args) {

        int height = 3;
        int width = height * 2 - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= width + 1; j++) {
                if (j >= height - i && j <= height + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = height; i >= 0; i--) {
            for (int j = 0; j <= width + 1; j++) {
                if (j >= height - i && j <= height + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



