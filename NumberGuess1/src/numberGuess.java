import java.util.Random;




import java.util.Scanner;

// Import random number generator & input scanner

public class numberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Declare  random number variables
		Random numb = new Random();
		Scanner scanner = new Scanner(System.in);
		
		
		int randombNumber = numb.nextInt(25) + 1;
		
	//Print Statements 	
		System.out.println("Hello, welcome to the Number Guessing Game!");

	//Declare tryCount outside of While loop 
		int tryCount = 0;
		
	//While Loop
			while(true) {	
		System.out.println("Enter a number (1-25):");

		int  playerGuess = scanner.nextInt();
		 tryCount++;
		
		if (playerGuess == randombNumber) {
			System.out.println("Correct! You guessed the right number!");
			System.out.println("It took you " + tryCount + " tries.");
			break;
			
		}
		else if (randombNumber > playerGuess) {
			System.out.println("Nope, the number is higher. Try again");
		}
		else {
			System.out.println("Nope, the number is lower. Try again");
		}
	}
	
	System.out.println("\n Go Hatters! \n Program by: Cimone Williams");
	
//Close scanner
	scanner.close();
	
	
		
		
		
	}

}
