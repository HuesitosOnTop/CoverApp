package Libraries;

import java.util.ArrayList;

public class TableHandler {
	// Characters
	private static String top_barrier_char = "_";
	private static String barrier_char = "|";

	private static int table_length = 0;
	private static int table_sections = 0;

	private static ArrayList<Integer> section_index = new ArrayList<Integer>();

	public static void CreateSections() {
  		StringBuilder sections = new StringBuilder();

  		// Add all top_barrier_char first
  		for (int i = 0; i < table_length; i++) {
  			sections.append(top_barrier_char);
  		}

  		// Find the spots for all possible sections
  		for (int i = 0; i <= table_length; i++) {
  			if (i % (table_sections * 10) == 0) {
  				if (i == 0) {
  					section_index.add(0);
  				} else {
  					section_index.add(i-1);
  				}
  			}
  		}

  		for (int i = 0; i < section_index.size(); i++) {
  			sections.replace(section_index.get(i), section_index.get(i)+1, barrier_char);
  		}
  		System.out.println(sections);
	}

	public static void CreateRow(int number, String name) {
		StringBuilder row = new StringBuilder();

		row.append(barrier_char + number + ". " + name);
		System.out.println(row);
	}

	public static void TableHeaderMaker(int sections, int length) {
		String top_line = "";

		table_length = length;
		table_sections = sections;

		for (int i = 0; i < length; i++) {
			top_line += top_barrier_char;
		}

		System.out.println(top_line);
		CreateSections();
	}

	public static void TableFooterMaker() {
		String bottom_line = barrier_char + "";

		for (int i = 0; i < table_length-2; i++) {
			bottom_line += top_barrier_char;
		}
		bottom_line += barrier_char + "\n";

		System.out.println(bottom_line);
	}
}