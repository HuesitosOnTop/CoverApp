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
			"Delete a cover",
			"Search for a cover",
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

			switch (selected_choice) {
				case 1:
					System.out.print("Song name: ");
					String song_name = input.nextLine();
					System.out.print("What type is the cover: ");
					String song_type = input.nextLine();
					System.out.print("Length of cover: ");
					int length = input.nextInt();
					System.out.print("Completed (true/false): ");
					boolean completed = input.nextBoolean();

					FileHandler.createCover(song_name, song_type, length, completed);
					break;
				case 2:
					break;
				case 3:
					FileHandler.listCovers();
					System.out.println("Choose what you'd like to edit (9 -> Go back): ");
					
					selected_choice = input.nextInt();
					switch (selected_choice) {
						case 9:
							break;
						default:
							System.out.println("The choice you entered was invalid");
					}

					break;
				case 4: 
					break;
				case 5:
					break;
				case 6:
					loop_runner = false;
					break;
				default: 
					System.out.println("The choice you've entered is not one of the choices above, try again.");
			}
		}	
	}
}