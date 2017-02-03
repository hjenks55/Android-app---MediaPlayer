package project;

import java.util.Scanner;

public class SearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		String[] names = new String[5];
		names[0]= "Harry";
		names[1] = "Bob";
		names[2] = "John";
		names[3] = "Carol";
		names[4] = "Andrew";
		System.out.println("Enter name to search: ");
		
		String nameSearch = kb.next();
		boolean found = false;
		int i = 0;
		int foundAt = 0;
				
		while (!found && i < names.length) {
			if (nameSearch == names[i]) {
				found = true;
				foundAt = i;
			}
			i++;
		}
		
		System.out.println("Name found At: " + foundAt);
					
		
		
		
		
		
	}

}
