import java.util.Scanner;

import static java.lang.Math.random;

public class GuessSecretNumber {

    //Write a guessing game where the user has to guess a secret number.
    // After every guess the program tells the user whether their
    // number was too large or too small. At the end the number of tries
    // needed should be printed.
    // It counts only as one try if they input the same number
    // multiple times consecutively.

    public static boolean guessingTheSecretNumber(int guess, int secretNumber) {
        if (secretNumber > guess) {
            System.out.println("Ohhhh, Guessed number is too small. Try again!!!!");
            return false;
        } else if (secretNumber < guess) {
            System.out.println("Ohhhh, Guessed number is too large. Try again!!!!");
            return false;
        } else {
            System.out.println("Congratulations!!! You guessed the correct number. You won our secret prize.");
            return true;
        }
    }

    public static void main(String[] args) {
        int secretNumber = (int) (random() * 1000);
        boolean check = false;
        while (!check) {
            Scanner guessTheNumber = new Scanner(System.in);
            System.out.println("Guess The Number");
            int resultOfGuess = guessTheNumber.nextInt();
            System.out.println(resultOfGuess);
            check = guessingTheSecretNumber(resultOfGuess, secretNumber);
            //List<Boolean> totalNumbersOfGuess = new ArrayList<>();
            //totalNumbersOfGuess.add(guessingTheSecretNumber(resultOfGuess,secretNumber));
        }
    }
}
