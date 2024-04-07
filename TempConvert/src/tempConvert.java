import java.util.Scanner;
	// Import java Scanner
	

public class tempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declare Variable 
		double celsius = 0.0;
		double fahrenheit = 0.0;
		// can also accept decimals
		
//scan user input		
		Scanner reader = new Scanner(System.in);
			

		//Welcome program 
		System.out.println("Welcome, what is the tempature in celsius degree: ");
		celsius = reader.nextDouble();
		
		//celsius to fahrenheit formula convert
		fahrenheit = 9.0/5.0*celsius + 32.0;
		System.out.println("The translation of celsius to fahrenheit is: " + fahrenheit);
		System.out.println("Enjoy the weather!");
		
		System.out.println("  ");
		System.out.println("Go Hatters");
		System.out.println("  ");
		System.out.println("\t\tProgram by: Cimone Williams");

		
		reader.close();
		//terminate reader
		
		
		
				
		
		
		
		
		
		
		
		

	}

}
