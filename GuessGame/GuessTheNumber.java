package GuessGame;


import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\033[0;32m"; 
    public static final String YELLOW = "\033[0;33m";  
    public static final String RED = "\033[0;31m";
    public static final String YELLOW_BOLD = "\033[1;33m"; 
    public static final String GREEN_BOLD = "\033[1;32m";  
    public static final String CYAN_BOLD = "\033[1;36m"; 
    public static final String PURPLE_BOLD = "\033[1;35m"; 

    public static int wins = 0;
    public static int loss = 0;
    private final int MAX_GUESSES = 5;
    private int number;
    private int guessCount = 1;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    // function to generate a random number

    private void generateRandomNumber() {
        number = random.nextInt(1, 51);
    }

    // function to take a guess from User

    private int promptGuessFromUser() {
        System.out.println();
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    // function to compare the guess and return the results

    private GuessResult checkGuess(int guess) {
        if (guess == number) {
            return GuessResult.CORRECT;
        } else if (guess > number) {
            return GuessResult.HIGHER;
        } else {
            return GuessResult.LOWER;
        }
    }

    // function to display comparison result to user

    private void displayResult(GuessResult result) {
        if (result == GuessResult.CORRECT) {
            System.out.printf(YELLOW_BOLD+"Congratulations! You guessed it right in "+GREEN_BOLD+"%s"+RESET+""+YELLOW_BOLD+" attempt(s)"+RESET, guessCount);
            wins++;
        } else if (result == GuessResult.HIGHER) {
            System.out.println("You have guessed: " +GREEN +"HIGHER"+RESET);
        } else {
            System.out.println("You have guessed: " +RED +"LOWER"+RESET);
        }
    }

    // function to run the Game

    public void run() {
        System.out.println();
        System.out.println(GREEN+"*********WELCOME TO GUESS THE NUMBER***********"+RESET);
        System.out.println(RED+"********************RULES**********************"+RESET);
        System.out.println(YELLOW+"**YOU HAVE 5 GUESSES TO FIND THE RIGHT NUMBER**"+RESET);
        System.out.println(RED+"***********************************************"+RESET);

        generateRandomNumber();

        while (guessCount <= MAX_GUESSES) {
            int guess = promptGuessFromUser();
            GuessResult result = checkGuess(guess);
            displayResult(result);
            if (result == GuessResult.CORRECT) {
                break;
            }
            guessCount++;
            if(guessCount == 6){
                loss++;
            }
        }
        System.out.println();
        System.out.println("GAME OVER. THE NUMBER WAS: "+PURPLE_BOLD +number+ RESET);
        
        
    }

}
