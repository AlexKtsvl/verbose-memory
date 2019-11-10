package methods;
public class dataTransfer {
    public static void main(String[] args) {

//        printName("james");
//
//        printName("adam");
//
//        firstChar("hsdhfsdhsdf");

        goTo("London","China");
        makeEmail("James","Bond",25);
    }
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void firstChar(String name) {
        System.out.println(name.charAt(0));
    }
    public static void goTo(String origin, String newLocation) {
        System.out.println("You start from " + origin);
        System.out.println("And you're going to " + newLocation);
    }
    public static void makeEmail(String firstName, String lastName, int age) {
        String email = firstName + age + lastName + "@cybertek.com";
        System.out.println(email);
    }
}
