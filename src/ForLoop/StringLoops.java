package ForLoop;

public class StringLoops {
    public static void main(String[] args) {
        String word = "CyberTek";

//        System.out.println(word.charAt(0));
//        System.out.println(word.charAt(1));

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'b') {
                String s = word.charAt(i) + "";
                System.out.println(s.toUpperCase() + " " + i);
                continue;
            }

            if(word.charAt(i) == 't'){
                break;
            }
                System.out.print(word.charAt(i) + " " + i);
                System.out.println();
            }
        }
    }


