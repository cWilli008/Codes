import java.util.Scanner;
	//Import java Scanner

public class gradeCaculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		// Receving Scanner object
		
	
		
	//Print Statments
		System.out.println("Welcome to the Grade Caculator!");
		System.out.println("Enter the number of grades youd'd like to caculate: ");
		
		int numGrades = scanner.nextInt();
		
		int[] grades = new int[numGrades];
		
		for(int i = 0; i < numGrades; i++) {
			
			System.out.println("Enter the grade " + (i + 1) + ": ");
			grades[i] = scanner.nextInt();
		}
		scanner.close();
		// Close scanner
			
		//Declare Variable
			int total = 0;
			
			
			for (int i1 = 0; i1 < numGrades; i1++) {
				total += grades[i1];
			}
		//caculate average of grade 
			double average = (double) total / numGrades;
			System.out.println("The avergae of the grades is: " + average);
			
		
			
			System.out.println("Go Hatters!");
			System.out.println("  ");
			System.out.println("\t\tProgram by: Cimone Williams");
	
			
	}		
		
		
		
		
		
		
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		

	}

