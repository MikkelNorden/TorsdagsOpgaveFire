import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object   	 
        Scanner scanner = new Scanner(System.in);
        // use hasNextDouble to check if input is numeric, 
        // if so...
        double input = scanner.nextDouble();
	// Read user input
        // Compare it with the random number
        if(input >= 0){
            double difference;
            if(input < rnd_number){
                difference = rnd_number - input;
            } else if(input > rnd_number) {
                difference = (rnd_number - input) * (-1);
            } else {
                difference = 0;
            }
            // Let the user know the result of the comparison
            System.out.println("The difference between the random number and yours is: " + difference);
            if(input < rnd_number){
                System.out.println("Your number is lower than the random number");
            } else if(input > rnd_number){
                System.out.println("Your number is higher than the random number");
            }
            // Let the user try again by calling this method recursively
            if(rnd_number != input){
            makeAGuess();
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively
        } else {
            System.out.println("Error");
            makeAGuess();
        }
    }
}