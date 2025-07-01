package Libraries.MainHandlers;

import java.io.*;

public class ProfileHandler {
	/*
		Profiles should ask for:
			Profile Name
			Instrument
			Global Settings:
				Load Last Profile
	*/
	private static String profiles_path = "";
	private static String current_dir = System.getProperty("user.dir");
	private static File main_profile_folder = new File(current_dir + File.separator + "Profiles");
	private static File chosen_profile = null;
	private static File chosen_profile_data = null;
	private static int total_profiles = 0;

	public static String CreateMainProfileFolder() {
		// Makes the main profile folder that holds all other profiles
		
		main_profile_folder.mkdir();

		profiles_path = main_profile_folder.getAbsolutePath();

		return profiles_path;
	}
	public static void CreateProfile() {
		File profile_folder = new File(profiles_path + File.separator + "Profile_" + (total_profiles+1));
		File profile_data = new File(profile_folder.getAbsolutePath() + File.separator + "profile_data.dat");

		System.out.println(profile_folder.getAbsolutePath()); 
		}
	public static void FetchProfileData() {
		// Fetches all the necessary private variables and sets them
	}
	public static void FetchProfiles() {
		// Gets user-created Profiles
	}
	public static void LoadProfile(int profile) {
		// Loads the profile the user chooses
	}
	public static void LoadLastProfile() {
		// Automatically loads the last profile the user was on
	}
	public static void DeleteProfile() {
		// Deletes a user profile
	}
}