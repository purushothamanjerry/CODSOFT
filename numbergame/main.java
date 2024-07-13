package numbergame;

import java.util.Random;
import java.util.Scanner;


public class main {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Welcome to the Number Guessing Game");

	        int scores = 0;
	        boolean AgainPlay = true;

	        while (AgainPlay) {
	            int targetNumber = random.nextInt(100) + 1;
	            int attempts = 0;
	            int maxAttempts = 4;

	            System.out.println("I have chosen a number between 1 and 100. Can you guess what it is?");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                scanner.nextLine();

	                attempts++;

	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
	                    scores++;
	                    break;
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }

	            if (attempts >= maxAttempts) {
	                System.out.println("Sorry, you have run out of attempts. The correct number was " + targetNumber + ".");
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            String AgainPlayInput = scanner.nextLine();
	            AgainPlay = AgainPlayInput.equalsIgnoreCase("yes");
	        }

	        System.out.println("Game over! Your scores: " + scores);

	        scanner.close();
	    }
	}