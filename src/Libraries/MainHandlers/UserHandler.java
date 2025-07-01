package Libraries.MainHandlers;

import java.io.*;
public class UserHandler {
	public static String isNewUser(String current_dir) {
		// Returns whether the user is new or not

		File profiles_folder = new File(current_dir + File.separator + "Profiles");


		if (profiles_folder.exists()) {
			return "true";
		}
		return "false";
	}

	public static void Tutorial() {
		// Gives the user a quick rundown of the app
	}
}