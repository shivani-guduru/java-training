package GuessGame;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int totalGames = 0;
        Scanner reader = new Scanner(System.in);
        while (true) {
            GuessTheNumber game = new GuessTheNumber();

            game.run();

            System.out.println();
            System.out.println("Press" + GuessTheNumber.GREEN + " y/Y" + GuessTheNumber.RESET + " to Continue and "
                    + GuessTheNumber.RED + "n/N" + GuessTheNumber.RESET + " to Exit ");
            char exit = reader.next().charAt(0);

            totalGames++;

            if (exit == "n".charAt(0) || exit == "N".charAt(0)) {
                break;
            }

        }

        System.out.println();
        System.out.println(GuessTheNumber.CYAN_BOLD + "STATS: " + GuessTheNumber.RESET + "TOTAL GAMES PLAYED "
                + GuessTheNumber.YELLOW_BOLD + totalGames + GuessTheNumber.RESET);
        System.out.println();
        System.out.println("Wins: " + GuessTheNumber.GREEN + GuessTheNumber.wins + GuessTheNumber.RESET);
        System.out.println();
        System.out.println("Loss: " + GuessTheNumber.RED + GuessTheNumber.loss + GuessTheNumber.RESET);
        System.out.println();

    }
}
