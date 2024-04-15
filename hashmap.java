package hashmap;

import java.util.HashMap;


import java.util.Map;


public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String > students = new HashMap<>();
		//  set Hashmap as a whole String = Studends
		
		//Add studends (.put to add studends)
		students.put(6813, "Eduardo");
		students.put(4772, "Veronica");
		students.put(4589, "Abby");
		students.put(1366, "Theo");

		
		//System.out.println(students);
	
		
	// replace theo ID number with sugeeth
		students.replace(1336, "Sugeeth");
		
		
		students.putIfAbsent(7724, "Cimone");
		
		System.out.println(students);
				
		
	// looking up the student with that ID number
		System.out.println(students.get(4772));
		
		
	
	Map<Integer, String > colors = new HashMap<>();
		//  set Hashmap as a whole String = Studends
	
	colors.put(0023, "Lavender");
	colors.put(0165, "Sky Blue");
	colors.put(0003, "Seaphone Green");
	
	System.out.println(colors);
	
	
	
	Map<String, String > Dictionary = new HashMap<>();
	//  set Hashmap as a whole String = Studends
	Dictionary.put("\nDog", " A 4 legged mamal that barkes to communicate.");
	Dictionary.put("\nSucculent", " Smaller plants that aid the envirment.");
	Dictionary.put("\nHashMap", " A Key value pair or (key, value)pair.");
	Dictionary.put("\nData Structure", " Consists of: - List - Linked - Array");

	System.out.println(Dictionary);

		
			
		

	}

}
