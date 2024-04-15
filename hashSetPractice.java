import java.util.HashSet;

import java.util.Set;

import java.util.TreeSet;



public class hashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//HashSet
		Set<String> fruits = new HashSet<>();
		
		//TreeSet string
				Set<String> veggies = new TreeSet<>();
				
		//TreeSet int
			//Set<int>  = new TreeSet<>();
		
		fruits.add("Apple");
		fruits.add("Bannanan");
		fruits.add("Mango");
		fruits.add("Strawberry");
				
		fruits.add("Apple");

		System.out.println("Fruits Set:" + fruits);
		
			
		//Adding elements 
		
		veggies.add("Corn");
		veggies.add("Tomatoes");
		veggies.add("Carrots");
		veggies.add("Broclie");
		
		System.out.println("Tree Set:" + veggies);


		
		
				
		

	}

}
