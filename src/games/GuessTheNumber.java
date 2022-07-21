package games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int MAX_GUESSES = 5;
    private int number;
    private int guessCount = 1;
    private int gameCount = 0;
    private boolean startGame = true;
    private boolean showBanner = true;
    private int wins = 0;
    private int loss = 0;
    private String contiGame = "No";
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    /*
     * function to generate a random number
     * */
    private void generateRandomNumber() {
        number = random.nextInt(1, 51);
        System.out.println();
        System.out.println(cliColorText.WHITE_BOLD_BRIGHT + "New" + cliColorText.BLUE_BOLD_BRIGHT + " GUESS NUMBER " + cliColorText.WHITE_BOLD_BRIGHT + "has been generated." + cliColorText.RESET);
        System.out.println(cliColorText.YELLOW_BOLD_BRIGHT + "Start Guessing Now!!" + cliColorText.RESET);
        System.out.println();
    }


    /*
     * function to take a guess from User
     * */
    private int promptGuessFromUser() {
        System.out.print(cliColorText.WHITE_BOLD_BRIGHT);
        if (guessCount < 5) {
            System.out.print("Enter your guess: ");
        } else {
            System.out.print("** Last Chance ** : ");
        }
        System.out.print(cliColorText.RESET);
        return scanner.nextInt();
    }

    /*
     * function to compare the guess and return the results
     * */
    private GuessResult checkGuess(int guess) {
        if (guess == number) {
            return GuessResult.CORRECT;
        } else if (guessCount > MAX_GUESSES && (guess < number || guess > number)) {
            return GuessResult.WRONG;
        } else if (guess > number) {
            return GuessResult.HIGHER;
        } else {
            return GuessResult.LOWER;
        }
    }

    /*
     * function to display comparison result to user
     * */
    private void displayResult(GuessResult result) {
        if (result == GuessResult.CORRECT) {
            System.out.println(cliColorText.GREEN_BOLD_BRIGHT);
            System.out.printf("Congratulations! You guessed it right in %s attempt(s)", guessCount - 1);
            System.out.println(cliColorText.RESET);
            wins++;
//            continueGame();
        } else if (result == GuessResult.HIGHER) {
            System.out.println("You have guessed " + cliColorText.YELLOW + "HIGHER");
            System.out.println(cliColorText.RESET);
        } else if (result == GuessResult.WRONG) {
            System.out.println(cliColorText.RED_BOLD_BRIGHT);
            System.out.println("Tick Tock **BOOM** . Try to predict right next time. The number was: " + number);
            System.out.println(cliColorText.RESET);
            loss++;
//            continueGame();
        } else {
            System.out.println("You have guessed " + cliColorText.MAGENTA + "LOWER");
            System.out.println(cliColorText.RESET);
        }
    }

    /*
     * function to loop the game based on input.
     * */
    private void continueGame() {
        String continueOrNot = "";
        System.out.println();
        System.out.print("Do you want to continue the game " + cliColorText.WHITE_BOLD_BRIGHT + "(" + cliColorText.GREEN_BRIGHT + "Yes" + cliColorText.WHITE_BOLD_BRIGHT + "/" + cliColorText.RED_BRIGHT + "No" + cliColorText.WHITE_BOLD_BRIGHT + ")" + cliColorText.RESET + ": ");
        continueOrNot = scanner.next();
        System.out.println();
        if (gameCount == 1 && (continueOrNot.equals("Yes") || continueOrNot.equals("yes") || continueOrNot.equals("Y") || continueOrNot.equals("y"))) {
            String bannerHideInput = "";
            System.out.print("Is the BANNER annoying, Should it be hidden (P.S. Decide now it's a 'one time question')?" + cliColorText.WHITE_BOLD_BRIGHT + "(" + cliColorText.GREEN_BRIGHT + "Yes" + cliColorText.WHITE_BOLD_BRIGHT + "/" + cliColorText.RED_BRIGHT + "No" + cliColorText.WHITE_BOLD_BRIGHT + ")" + cliColorText.RESET + ": ");
            bannerHideInput = scanner.next();
            System.out.println();
            if (bannerHideInput.equals("Yes") || bannerHideInput.equals("yes") || bannerHideInput.equals("Y") || bannerHideInput.equals("y")) {
                showBanner = false;
            } else {
                showBanner = true;
            }
        }
//        System.out.println("value is " + continueOrNot);
        if (continueOrNot.equals("Yes") || continueOrNot.equals("yes") || continueOrNot.equals("Y") || continueOrNot.equals("y")) {
            guessCount = 1;
            run();
        } else {
            System.out.print("Game has ended");
            System.out.println();
            if (gameCount == 1) {
                System.out.println("You have " + cliColorText.GREEN_BOLD_BRIGHT + "won " + wins + cliColorText.RESET + " and" + cliColorText.RED_BOLD_BRIGHT + " lost " + loss + cliColorText.RESET + " game out of " + gameCount + " game");
                System.out.println(cliColorText.YELLOW_BOLD_BRIGHT + "Thank you for PLaying ALONG. Have a nice day.");
                System.out.println(cliColorText.RESET);
            } else if (gameCount > 1) {
                System.out.println("You have " + cliColorText.GREEN_BOLD_BRIGHT + "won " + wins + cliColorText.RESET + " and" + cliColorText.RED_BOLD_BRIGHT + " lost " + loss + cliColorText.RESET + " games out of " + gameCount + " games");
                System.out.println(cliColorText.YELLOW_BOLD_BRIGHT + "Thank you for PLaying ALONG. Have a nice day.");
                System.out.println(cliColorText.RESET);
            }
            wins = 0;
            loss = 0;
        }
    }

    /*
     * function to run the Game
     * */
    public void run() {

        if (showBanner == true) {
            System.out.println();
            System.out.println(cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET + cliColorText.WHITE_BOLD_BRIGHT + "                                                 " + cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET);
            System.out.println(cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET + "         " + cliColorText.BLUE_BOLD_BRIGHT + " WELCOME TO GUESS THE NUMBER " + cliColorText.RESET + "           " + cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET);
            System.out.println(cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET + "                    " + cliColorText.RED_BOLD_BRIGHT + " Rules:" + cliColorText.RESET + "                      " + cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET);
            System.out.println(cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET + " " + cliColorText.YELLOW_BOLD_BRIGHT + " ->" + cliColorText.RESET + cliColorText.WHITE_BOLD_BRIGHT + " ONLY 5 GUESSES to find the RIGHT number " + cliColorText.YELLOW_BOLD_BRIGHT + "<- " + cliColorText.RESET + " " + cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET);
            System.out.println(cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET + " " + cliColorText.YELLOW_BOLD_BRIGHT + " ->" + cliColorText.RESET + cliColorText.WHITE_BOLD_BRIGHT + " Do not keep a sad face while playing!!! " + cliColorText.YELLOW_BOLD_BRIGHT + "<- " + cliColorText.RESET + " " + cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET);
            System.out.println(cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET + cliColorText.WHITE_BOLD_BRIGHT + "                                                 " + cliColorText.WHITE_BACKGROUND_BRIGHT + "*" + cliColorText.RESET);
            System.out.println(cliColorText.RESET);
        }
        gameCount++;

        if (gameCount == 1) {
            String startGameOrNot = "";
            System.out.print("Shall we begin " + cliColorText.WHITE_BOLD_BRIGHT + "(" + cliColorText.GREEN_BRIGHT + "Yes" + cliColorText.WHITE_BOLD_BRIGHT + "/" + cliColorText.RED_BRIGHT + "No" + cliColorText.WHITE_BOLD_BRIGHT + ")" + cliColorText.RESET + ": ");
            startGameOrNot = scanner.next();
            System.out.println();
            if (startGameOrNot.equals("Yes") || startGameOrNot.equals("yes") || startGameOrNot.equals("Y") || startGameOrNot.equals("y")) {
                startGame = true;
            } else {
                startGame = false;
            }
        } else {
            startGame = true;
        }

        if (startGame == true) {
            generateRandomNumber();

            GuessResult finalResult = GuessResult.STARTED;
            while (guessCount <= MAX_GUESSES) {
                int guess = promptGuessFromUser();
                guessCount++;
                GuessResult result = checkGuess(guess);
                displayResult(result);
                finalResult = result;
                if (result == GuessResult.CORRECT) {
                    break;
                }
//            System.out.println(guessCount);
            }
            continueGame();
        }
    }
}