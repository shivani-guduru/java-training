package games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private final int MAX_GUESSES = 5;
    private int number;
    private int guessCount = 1;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    /*
     * function to generate a random number
     * */
    private void generateRandomNumber() {
        number = random.nextInt(1, 51);
    }


    /*
     * function to take a guess from User
     * */
    private int promptGuessFromUser() {
        System.out.print("Enter your guess:");
        return scanner.nextInt();
    }

    /*
     * function to compare the guess and return the results
     * */
    private GuessResult checkGuess(int guess) {
        if (guess == number) {
            return GuessResult.CORRECT;
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
            System.out.printf("Congratulations! You guessed it right in %s attempt(s)", guessCount);
        } else if (result == GuessResult.HIGHER) {
            System.out.println("You have guessed HIGHER");
        } else {
            System.out.println("You have guessed LOWER");
        }
    }

    /*
     * function to run the Game
     * */
    public void run() {
        System.out.println("*********WELCOME TO GUESS THE NUMBER***********");
        System.out.println("********************RULES**********************");
        System.out.println("**YOU HAVE 5 GUESSES TO FIND THE RIGHT NUMBER**");
        System.out.println("***********************************************");

        generateRandomNumber();

        while (guessCount <= MAX_GUESSES) {
            int guess = promptGuessFromUser();
            GuessResult result = checkGuess(guess);
            displayResult(result);
            if (result == GuessResult.CORRECT) {
                break;
            }
            guessCount++;
        }

        System.out.println("GAME OVER. THE NUMBER WAS " + number);
    }
}