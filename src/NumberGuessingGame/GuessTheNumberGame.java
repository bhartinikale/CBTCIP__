package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfAttempts = 0;
        int maxAttempts = 10; // You can adjust the number of attempts

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I've generated a random number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        while (numberOfAttempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfAttempts + " attempts.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        if (numberOfAttempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
        }

        scanner.close();
    }

}
