package methods;

public class datatypePromotion {
    public static void main(String[] args) {
        int a = 45;
        calc(a);
    }
    public static void calc(byte i) {
        System.out.println("using byte");
    }

    public static void calc(long l) {
        System.out.println("using long");
    }

    public static void calc(float f) {
        System.out.println("using float");
    }

}

//byte > short > int > float/long > double