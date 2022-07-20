import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int a, b;
        String operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Enter an operator");
        operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println("addition of given two number is " + (a + b));
                break;

            case "-":
                System.out.println("subtraction of given two number is " + (a - b));
                break;

            case "/":
                System.out.println("division of given two number is " + (a / b));
                break;

            case "*":
                System.out.println("multiplication of given two number is" + (a * b));
                break;

            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
