import java.util.ArrayList;


//import to store the files
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;


import java.util.LinkedList;
import java.util.List;

import java.util.Scanner;
import java.util.Random;

import java.io.IOException;
import java.io.Writer;


public class footballSimulator {
	
	private String teamA;
	private String teamB;
	private int teamScoreA;
	private int teamScoreB;
	
	public footballSimulator(String teamA, String teamB) {
		this.teamA = teamA;
		this.teamB = teamB;
		this.teamScoreA = 0;
		this.teamScoreB = 0;	
	}
	
// Declare only possible points to aquire
	public void simulateQuarter() {
		Random random = new Random();
		int [] possibleScore = {6, 3, 2, 1,};

	
// Simulate points for each quarter
	int teamAQuarterScore = possibleScore[random.nextInt(possibleScore.length)];
	int teamBQuarterScore = possibleScore[random.nextInt(possibleScore.length)];
	
	// Add to total score
	teamScoreA += teamAQuarterScore;
	teamScoreB += teamBQuarterScore;
	
	//display the quarter results
	System.out.println(teamA + " Scored " + teamAQuarterScore + " this quarter. They are x ahead/behind");
	System.out.println(teamB + " Scored " + teamBQuarterScore + " this quarter. They are x ahead/behind");
	System.out.println("Current score: " + teamA + ": " + teamScoreA + ", " + teamB + ": " + teamScoreB);

	String quarterResult = teamA + " Scored " + teamAQuarterScore + " this quarter. " + teamB + " Scored " + teamBQuarterScore + " this quarter. " + " gCurrent score: " + teamA + ": " + teamScoreA + ", " + teamB + ": " + teamScoreB;
	
		
	//Open file for writing
	try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Cimone\\Desktop\\footballSimulator.csv"))) {
		writer.write(quarterResult + "\n");
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
	
	public void displayFinalResult() {
		System.out.println("Final Score: " +  teamA + ": " + teamScoreA + ", " + teamB + ": " + teamScoreB);
		
		System.out.println("_______");
		System.out.println("Go Hatters!");
		System.out.println("Program By: Cimone Williams");
		System.out.println("_______");
		
		if (teamScoreA > teamScoreB) {
			System.out.println(teamA + " Wins!");
		} else if (teamScoreA < teamScoreB) {
			System.out.println(teamB + " Wins");
		} else {
			System.out.println("It's a tie!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the Home Team Name: ");
	String homeTown = scanner.nextLine();
	
	System.out.print("Enter the Away Team Name: ");
	String awayTeam = scanner.nextLine();
	
		//Initialize teams
	footballSimulator Simulation = new footballSimulator(homeTown, awayTeam);
	
		
	
	//Simulate 4 quarters
		for (int i = 1; i<= 4; i++) {
			System.out.println("Quarter " + i);
			((footballSimulator) Simulation).simulateQuarter();
			System.out.println("-------------------");	
			

	// Display final results
		((footballSimulator) Simulation).displayFinalResult();
		
//Reading From a File
				try {
					BufferedReader reader = new BufferedReader(new FileReader("footballSimulator.csv"));
					
					String line;
					
					while ((line = reader.readLine()) != null){
					System.out.println(line);
					}
	
		
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		}
	}
	
}

