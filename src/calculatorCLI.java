import java.util.Scanner;

public class calculatorCLI {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String oper = "";
        boolean calc_end = false;
        while (oper != "exit") {
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("Enter first num: ");
            int first_num = scanner.nextInt();
            System.out.print("Enter second num: ");
            int second_num = scanner.nextInt();
            // used to skip the newline
            scanner.nextLine();
            System.out.print("Enter the operation: ");
            oper = scanner.nextLine();
            System.out.print(oper);
            switch (oper) {
                case "+":
                    int sum = first_num + second_num;
                    System.out.print("The sum of two numbers is: " + sum);
                    break;
                case "-":
                    int diff = first_num - second_num;
                    System.out.print("The difference of two numbers is: " + diff);
                    break;
                case "/":
                    int div = first_num / second_num;
                    System.out.print("The division of two numbers is: " + div);
                    break;
                case "*":
                    int mul = first_num * second_num;
                    System.out.print("The multiplication of two numbers is: " + mul);
                    break;
                case "%":
                    int modulo = first_num % second_num;
                    System.out.print("The modulos of two numbers is: " + modulo);
                    break;
                case "exit":
                    System.out.print("Calculator End");
                    oper = "exit";
                    break;
                default:
                    System.out.print("No case selected :( Please, select an operator.");
            }
        }
    }
}
