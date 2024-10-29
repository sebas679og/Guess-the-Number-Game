/*
     "Guess the Number Game"
    Description: Write a program that generates a random number between 1 and 100. 
    The user should try to guess the number, and after each guess, the program should indicate 
    whether the guess was too high, too low, or correct. The game should continue until the user guesses the correct number.

    Requirements:
        1. The program should generate a random number between 1 and 100.
        2. The user should be prompted to enter their guess.
        3. If the user's guess is too high, the program should print "Too high, try again!".
        4. If the user's guess is too low, the program should print "Too low, try again!".
        5. If the user guesses correctly, the program should print "Congratulations! You guessed the number in X attempts" 
           (where X is the number of attempts).
        6. The program should keep track of the number of attempts made by the user.
        7. Hint: You can use a random number generator from your language's standard library. 
           For example, in Python, you can use the random module.

    Things to Consider:
        1. You are encouraged to ask questions at any point if you get stuck or need clarification. 
           Feel free to reach out for help whenever needed.
        2. The use of AI tools to generate or complete the code is strictly prohibited. 
           This exercise is meant to help you build your programming skills and solve problems independently.
*/

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        //We import the Libraries to use
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        //We create varibales to store the data
        int randomNumber = random.nextInt(100) + 1; //Random number between 1 and 100
        int number = 0;
        int attempts = 0; 
        
        while(number != randomNumber){            
            System.out.println("Enter a number:");
            number = scanner.nextInt();
            attempts ++; //count of the number of attempts made by the user
            
            //We compare the random number with the one entered by the user.
            if (number < randomNumber) {
                System.out.println("Too low, try again!");
            }else if(number > randomNumber){
                System.out.println("Too high, try again!");
            }else{
                System.out.println("\nCongratulations! You guessed the number in " + attempts + " attempts");
            }
        }
        scanner.close();
    }
}
