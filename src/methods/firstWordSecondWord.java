package methods;

public class firstWordSecondWord {
    public static void main(String[] args) {
        System.out.println(giveWords("day", "night", 4));
    }

    public static String giveWords(String first, String second) {
        return first + second + first;
    }

    public static String giveWords(String first, String second, int times) {

        if (times <= 0) {
            return "";
        }
        String word = "";

        for (int i = 0; i < times; i++) {

            word += first;

            if(i == times -1){
                break;
            }

            word += second;
        }
    return word;
    }


}
