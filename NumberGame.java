
//          NUMBER GUSSESING GAME




package com.codsoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int lowerRange = 1;
	        int upperRange = 100;
	        int maxAttempts = 6;
	        int score = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Guess a number between " + lowerRange + " and " + upperRange + ".");

	        boolean playAgain = true;
	        while (playAgain) {
	            int targetNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
	            int attempts = 0;

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You guessed the correct number " + targetNumber + " in " + attempts + " attempts.");
	                    score++;
	                    break;
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Your guess is too low.");
	                } else {
	                    System.out.println("Your guess is too high.");
	                }

	                if (attempts == maxAttempts) {
	                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
	                }
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainResponse = scanner.next().toLowerCase();
	            playAgain = playAgainResponse.equals("yes");
	        }

	        System.out.println("Game over! Your total score is: " + score);
	        scanner.close();
	    }
}

