package Main;

import java.util.*;
import java.io.*;

import Libraries.Utilities.*;
import Libraries.MainHandlers.*;

public class Main {
	public static void main(String args[]) {
		String current_dir = System.getProperty("user.dir");
		String main_profile_path = "";

		String[] cover_choices = {
			"Create a cover",
			"Edit a cover",
			"Delete a cover",
			"Search for a cover",
			"Close the program"
		};

		String[] profile_choices = {
			"Load a profile",
			"Create a Profile",
			"Delete a Profile",
			"Edit a Profile",
			"Exit"
		};

		boolean loop_runner = true;

		ConsoleHandler.ClearConsole();
		BannerHandler.CreateBanner();

		Scanner input = new Scanner(System.in);

		File main_profile_folder = new File(main_profile_path);

		while (loop_runner) {
			// Checks to see if the user is new
			switch (UserHandler.isNewUser(current_dir)) {
				case "true":
					System.out.println("Welcome back USER");
					break;
				case "false":
					System.out.println("It seems this is you're first time running ReChord" + "\n" + "What would you like to be called?");

					// Creates the main profile folder
					main_profile_path = ProfileHandler.CreateMainProfileFolder();

					// Gets the users username and saves it
					String response = input.next().toLowerCase();

					// Ask the user whether they want a tutorial
					System.out.println("Would you like a tutorial? (Y/N)");
					response = input.next().toLowerCase();
					switch (response) {
						case "y":
							break;
						case "n":
							break;
						default:
							System.out.println("It seems like the answer you responded with was not Y or N, try again.");
					}
				default:
					System.out.println("idk -\\_(-_-)_/-"); // This is 5 am me speaking after being awake for 18 hours :)
			}		
			System.out.println("Select your action:");
			ArrayHandler.listArray(profile_choices);

			int int_response = input.nextInt();
			switch (int_response) {
				case 1:
					if (main_profile_folder.length() == 0) {
						System.out.println("There are no profiles, try creating one.");
					} else {
						// Do something to get the profiles
					}
					break;
				case 2:
					ProfileHandler.CreateProfile();
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					loop_runner = false;
					ConsoleHandler.ClearConsole();
				default:
					System.out.println("The number you've entered is not within the range, please try again");
					ConsoleHandler.ClearConsole();
			}
		}
	}
}