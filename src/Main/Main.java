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

		BannerHandler.CreateBanner();
		System.out.println(FileHandler.CreateDependecies());
		System.out.println("Welcome to the Cover Manager App.");

		File covers_dat = new File(currentDir + "\\Files\\Covers.dat");
		File preferences_dat = new File(currentDir + "\\Files\\Settings.dat");

		Scanner input = new Scanner(System.in);

		while (loop_runner) {
			System.out.println("Choose one of the choices below: ");
			ArrayHandler.listArray(choices);

			int selected_choice = input.nextInt();
			input.nextLine();

			switch (selected_choice) {
				case 1:
					ConsoleHandler.ClearConsole();
					System.out.print("Song name: ");
					String song_name = input.nextLine();
					System.out.print("What type is the cover (Verse, Chorus, Bridge, Solo, Harmonies): ");
					String song_type = input.nextLine();
					System.out.print("Length of cover (1-60): ");
					int length = input.nextInt();
					System.out.print("Difficulty (1-5): ");
					int difficulty = input.nextInt();
					System.out.print("Completed (true/false): ");
					boolean completed = input.nextBoolean();

					FileHandler.createCover(song_name, song_type, length, difficulty, completed);
					break;
				case 2:
					ConsoleHandler.ClearConsole();
					FileHandler.listCovers();
					System.out.println("Choose the cover you'd like to edit.");
					
					selected_choice = input.nextInt();
					switch (selected_choice) {
						case 9:
							break;
						default:
							break;
					}
					break;
				case 3:
					break;
				case 4: 
					break;
				case 5:
					ConsoleHandler.ClearConsole();
					loop_runner = false;
					break;
				default: 
					System.out.println("The choice you've entered is not one of the choices above, try again.");
			}
		}	
	}
}