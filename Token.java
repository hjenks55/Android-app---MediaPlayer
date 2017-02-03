package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Token {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String str = "one;two;three";
		String[] tokens = str.split(";");
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		
		/*
		File people = new File("people.txt");
		Scanner inputFile = new Scanner(people);
		
		String str = inputFile.nextLine();
		String[] tokens;
		
		while (inputFile.hasNextLine()) {
			
		}
		*/
	}

}
