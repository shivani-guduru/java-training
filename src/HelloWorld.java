import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
//        test code for git commit and push
        int j = 0;
        while (i < args.length) {
            sum = sum + Integer.parseInt(args[i]);
            i++;
        }

        System.out.println("Sum of arguments: " + sum);

        var scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ". You are " + age + " year(s) old");
    }
}
