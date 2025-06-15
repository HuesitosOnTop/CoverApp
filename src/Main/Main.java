package Main;

import java.util.*;
import java.io.*;

import Libraries.*;

public class Main {
	public static void main(String args[]) {
		String currentDir = System.getProperty("user.dir");
		String[] choices = {
			"Create a cover",
			"Edit a cover",
			"Close the program"
		};

		boolean loop_runner = true;

		System.out.println(FileHandler.CreateDependecies());
		System.out.println("Welcome to the Cover Manager App.");

		File covers_dat = new File(currentDir + "\\Files\\Covers.dat");
		File preferences_dat = new File(currentDir + "\\Files\\Preferences.dat");

		Scanner input = new Scanner(System.in);

		while (loop_runner) {
			System.out.println("Choose one of the choices below: ");

			for(int i = 0; i < choices.length; i++) {
				System.out.println((i+1) + ". " + choices[i]);
			}

			int selected_choice = input.nextInt();
			input.nextLine();
			System.out.println("");

			switch (selected_choice) {
				case 1: 
					FileHandler.createCover("Afterlife", 3, 6, true);
					break;
				case 2:
					FileHandler.listCovers();
					break;
				case 3: 
					loop_runner = false;
					break;
				default: 
					System.out.println("The choice you've entered is not one of the choices above, try again.");
			}
		}	
	}
}