import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {


//        System.out.println("Sum of arguments: " + sumi);

        var scanner = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int first_num  = scanner.nextInt();
        System.out.print("Enter second num: ");
        int second_num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the operation: ");
        String oper = scanner.nextLine();
        switch (oper) {
            case "+":
                int sum = first_num + second_num;
                System.out.print("The sum of two numbers is: " + sum);
                break;
            case "-":
                int diff = first_num - second_num;
                System.out.print("The sum of two numbers is: " + diff);
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
            default:
                System.out.print("No case selected :(");
        }
//        System.out.println("Hello " + name + ". You are " + age + " year(s) old");
    }
}
