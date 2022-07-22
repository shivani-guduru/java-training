package games.guesstheword;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private final String word;
    private char[] guessedWord;
    private int guessesLeft;

    /*
     * Constructor
     * */
    public GuessTheWord() {
        word = pickAWord();
        guessedWord = new char[word.length()];
        Arrays.fill(guessedWord, '_');
        guessesLeft = guessedWord.length + 2;
    }

    /*
     * Function to pick a random word from the list
     * */
    private String pickAWord() {
        int wordIndex = random.nextInt(0, WordList.WORDS.length);
        return WordList.WORDS[wordIndex].toUpperCase();
    }

    /*
     * Function to ask user to enter a guess
     * */
    private char promptGuess() {
        System.out.printf("Enter your guess (%s guesses left):", guessesLeft);
        return scanner.next().charAt(0);
    }

    /*
     * Function to check user's guess
     * */
    private boolean checkGuess(char guess) {
        for (int i = 0; i < guessedWord.length; i++) {
            if (Character.toUpperCase(guess) == word.charAt(i)) {
                guessedWord[i] = Character.toUpperCase(guess);
            }
        }

        return word.equals(String.copyValueOf(guessedWord));
    }

    /*
     * Function to displayed guessed word
     * */
    private void displayGuessedWord() {
        for (char c : guessedWord) {
            System.out.printf("%s ", c);
        }

        System.out.println();
    }

    /*
     * Run the game
     * */
    public void run() {
        System.out.println("*******************************************");
        System.out.println("**********WELCOME TO HANGMAN GAME**********");
        System.out.println("*******************************************");

        while (guessesLeft > 0) {
            char guess = promptGuess();
            guessesLeft--;
            boolean hasWon = checkGuess(guess);
            displayGuessedWord();
            if (hasWon) {
                System.out.printf("Congratulations. You have guessed it right with %s guesses left\n", guessesLeft);
                break;
            }
        }

        System.out.printf("Game Over. The word was : %s", word);
    }
}
