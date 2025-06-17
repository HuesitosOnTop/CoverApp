package Libraries;

import java.io.*;
import java.util.Scanner;

import Libraries.TableHandler;

public class FileHandler {
	private static String current_dir = System.getProperty("user.dir");

	private static File files_folder = new File(current_dir + File.separator + "Files");
	private static File covers_dat = new File(files_folder.getAbsolutePath() + "\\Covers.dat");
	private static File preferences_dat = new File(files_folder.getAbsolutePath() + "\\Preferences.dat");
	private static File[] all_files = {
		files_folder,
		covers_dat,
		preferences_dat
	};

	public static String CreateDependecies() {
		int total_files_created = 0;
		

		if (!files_folder.exists()) {
			files_folder.mkdir();
			try {
				covers_dat.createNewFile();
				preferences_dat.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Return if files are made or not
		for (int i = 0; i < all_files.length; i++) {
			if (all_files[i].exists()) {
				total_files_created++;
			}
		}

		String output = (total_files_created == all_files.length) ? "Files Exist." : "Files Created.";

		return output;
	}

<<<<<<< Updated upstream
	public static void listCovers() {
		int line_number = 1;
		try {
			Scanner file_reader = new Scanner(covers_dat);
			while (file_reader.hasNextLine()) {
				String lines = file_reader.nextLine();
				int semicolon = lines.indexOf(';');
				int equals = lines.indexOf('=');

				String new_line = lines.substring(equals + 1, semicolon);
				
				System.out.println(line_number + ". " + new_line);
				line_number++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String createCover(String name, int start_time, int end_time, boolean completed) {
=======
	public static String createCover(String name, String type, int total_time, boolean completed) {
>>>>>>> Stashed changes
		try {
			FileWriter writer = new FileWriter(covers_dat);

			String template =
			"songname=" +  name + ";" +
			"length=" +    total_time + ";" +
			"type=" + 	   type + ";" +
			"completed=" + completed + ";";

			writer.write(template);

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "Successfully created cover.";
	}
<<<<<<< Updated upstream
=======

	public static void listCovers() {
		int line_number = 1;
		try {
			Scanner file_reader = new Scanner(covers_dat);
			if (covers_dat.length() == 0) {
				System.out.println("There are no covers.");
			} else {
				TableHandler.TableHeaderMaker(4, 160);
				while (file_reader.hasNextLine()) {
					String lines = file_reader.nextLine();
					int semicolon = lines.indexOf(';');
					int equals = lines.indexOf('=');

					String song_name = lines.substring(equals + 1, semicolon);
					
					TableHandler.CreateRow(line_number, song_name);
					line_number++;
				}
				TableHandler.TableFooterMaker();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void editCover(int cover_choice, int edit_choice) {
		
	}

	public static void deleteCover() {
		System.out.println("yes");
	}
>>>>>>> Stashed changes
}