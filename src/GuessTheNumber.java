import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int MAX_GUESSES = 5;
    public static int wins=0;
    public static int loss=0;
    int number;
        Random random;
        Scanner scanner;
        int guessCount = 1;
        public GuessTheNumber(){
            scanner = new Scanner(System.in);
            random = new Random();
            generateRandomNumber();

        }
        void generateRandomNumber() {
            number = random.nextInt(1, 21);
        }
        int promoteGuessFromUser(){
            System.out.println("Enter Your Guess");
            return scanner.nextInt();
        }
        int checkGuess(int guess){
            if (guess == number) {
                return 0;
            } else if (guess > number) {
                return 1;
            } else {
                return -1;
            }

        }
        void displayResults(int result){
            switch(result) {
                case 0:
                    System.out.println("Congrats your guess is correct");
                    wins++;
                    break;
                case 1:
                    System.out.println("you have guessed higher");
                    break;
                case -1:
                    System.out.println("you have guessed lower");
                    break;
            }
            }
        void run() {
            System.out.println("Welcome to guess number");
            while(guessCount <= MAX_GUESSES) {
               int guess = promoteGuessFromUser();
               int result = checkGuess(guess);
               displayResults(result);
               if(result == 0) {
                   break;
               }
               guessCount++;
               }
            if(guessCount == 6){
                loss++;
            }
            System.out.println("game over the number is " +number);

            }
        }




