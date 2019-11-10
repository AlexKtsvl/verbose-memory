package methods;

public class lengthOfString {
    public static void main(String[] args) {
        equalLength("names",8);
    }

    public static void equalLength(String str, int len) {
        if(str.length() == len) {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
