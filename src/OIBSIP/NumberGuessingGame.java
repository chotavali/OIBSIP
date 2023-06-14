package OIBSIP;

import java.util.*;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int guess = 0;
        int score = 100;
        
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have to chosen a number between 1 and 100. Try to guess it!");
        System.out.println("Guess the correct number to win the game u have only 7 attempts");
        
        
        while (guess != secretNumber && attempts<7) {
            System.out.print("Enter your guess number: ");
            guess = scanner.nextInt();
            ++attempts;
            
            
            
            
            if (guess < secretNumber) {
                System.out.println("lower than the secretnumber ! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("higher than the secretnumber! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
             
                }
        
    if (attempts == 1 && guess==secretNumber) {
        System.out.println("great! you guessed in the first attempt ");
        
    }
    else if(attempts>=7) {
    	System.out.println("you lost the game try again from start");
    }
        score = 100 - attempts*5;
        	
System.out.println("your score is"+score);
        
        scanner.close(); 
        }
    }