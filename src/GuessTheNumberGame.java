import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    
    //we instantiate the classes of the libraries to use
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        //we instantiate the classes of the libraries to use
        GuessTheNumberGame intancia = new GuessTheNumberGame();
        Scanner scanner = new Scanner(System.in);

        //We declare and assign variables
        int game;

        //We start the game with the welcome message and the game options
        System.out.println("¡welcome to the guess the number game!");
        System.out.println("Select the type of game you want to play below");
        System.out.println("1. Default game: random number from 1 to 100 with unlimited attempts.");
        System.out.println("2. Custom Game: Enter the range of numbers you want to guess from and choose the intets.");
        game = scanner.nextInt();

        //we use a switch to determine which game the user wants to play
        switch (game) {
            case 1:
                intancia.defaultGame();
                break;
            case 2:
                intancia.CustomGame();
                break;
            default:
                System.out.println("Game type not found");
                break;
        }
        scanner.close();
    }

    public void defaultGame(){

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

    public void CustomGame(){

        //We declare and assign variables
        int minimo;
        int maximo;
        int number = 0;
        int randomNumber;
        int intetosMaximos;
        int attempts = 0;

        //Request minimum and maximum values, and verify that minimum <= maximum.
        do {
            System.out.print("Enter the minimum value of the range:");
            minimo = scanner.nextInt();

            System.out.print("Enter the maximum value of the range:");
            maximo = scanner.nextInt();

            if (minimo > maximo) {
                System.out.println("The minimum value cannot be greater than the maximum value. Try again.");
            }
        } while (minimo > maximo);

        randomNumber = random.nextInt(maximo - minimo + 1) + minimo; //Random number according to user conditions

        //We ask the user for the number of attempts
        System.out.println("Enter the number of Attempts:");
        intetosMaximos = scanner.nextInt();
        
        while (number != randomNumber && attempts < intetosMaximos) {
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

            if (attempts == intetosMaximos) {
                System.out.println("you ran out of attempts");
            }
        }
    }
}
