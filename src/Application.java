import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int totalgames = 0;
        while(true) {
            GuessTheNumber game = new GuessTheNumber();
            game.run();
            System.out.println("To continue the game enter y/n ");
            Scanner scanner = new Scanner(System.in);
            char exit = scanner.next().charAt(0);
            totalgames++;
            if (exit == "n".charAt(0)) {
                break;
            }
        }
          System.out.println("Result: you have won in " + GuessTheNumber.wins + " game(s) you have lossed in "+ GuessTheNumber.loss+ " game(s) out of total played game(s) is "+totalgames);
    }
}