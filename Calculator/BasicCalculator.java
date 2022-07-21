package Calculator;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("ENTER THE FIRST NUMBER: ");
            float number1 = reader.nextFloat();
            System.out.print("ENTER THE SECOND NUMBER: ");
            float number2 = reader.nextFloat();
            System.out.print("ENTER THE OPERATOR (+ - * / % ): ");
            char operator = reader.next().charAt(0);
            System.out.println();

            float result = 0;

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;
                case '%':
                    result = number1 % number2;
                    System.out.println(number1 + " % " + number2 + " = " + result);
                    break;
                default:
                    System.out.println("------UNKNOWN OPERATION TRY AGAIN------");
                    reader.close();
                    System.exit(0);

                    break;

            }
            System.out.println();
            System.out.println("Press y/Y to Continue and n/N to Exit ");
            char exit = reader.next().charAt(0);

            if (exit == "n".charAt(0) || exit == "N".charAt(0)) {
                break;
            }

        }

    }

}
