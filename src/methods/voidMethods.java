package methods;

public class voidMethods {
    public static void main(String[] args) {
        sayHello();
        sayBye();
        sayHello();
    }

    public static void sayHello() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HI");
        }
    }

    public static void sayBye() {
        System.out.println("Bye");

    }
}
