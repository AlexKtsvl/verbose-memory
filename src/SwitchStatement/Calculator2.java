package SwitchStatement;

        import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        input.nextLine();
        System.out.println("Enter an operator");
        String op = input.nextLine();

        double result = 0;
        boolean valid = true;

        switch (op){
            case "+":
                result = num1 + num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "%":
                result = num1 % num2;
            case "*":
                result = num1 * num2;
                break;
            default:
                System.out.println("Invalid operator");
                valid = false;
        }

        if(valid){
            System.out.println("" + num1 + " " + op + " " + num2 + " = " + result);
        }


    }


}
