package Oct10Substrings;

public class not {
    public static void main(String[] args) {
        String word = "Today is the nice day";

        boolean b = word.startsWith("Today");
        System.out.println(b);
        System.out.println("Not: " + !b);

        System.out.println(!word.endsWith("day"));
        System.out.println(!word.startsWith("day"));


        System.out.println();


    }
}
