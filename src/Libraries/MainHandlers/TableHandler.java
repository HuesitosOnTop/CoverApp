package Libraries.MainHandlers;

import java.util.ArrayList;

public class TableHandler {
	// Characters
	private static String top_barrier_char = "_";
	private static String barrier_char = "|";

	// Table ints
	private static int table_length = 0;
	private static int table_sections = 0;
	private static int section_width = 0;

	private static ArrayList<Integer> section_index = new ArrayList<Integer>();
	private static StringBuilder middle_row = new StringBuilder();

	public static void CreateRow(int number, String name) {
		StringBuilder row = new StringBuilder();

		// Fill empty spaces
		for (int i = 0; i < table_length; i++) {
			row.append(" ");
		}

		for (int index : section_index) {
			if (index >= 0 && index <= table_length) {
				row.setCharAt(index, barrier_char.charAt(0));
			}
		}

		String content = barrier_char + number + ". " + name;
		int insert_index = section_index.get(0);

		for (int i = 0; i < content.length() && (insert_index + i) < table_length; i++) {
			row.setCharAt(insert_index + i, content.charAt(i));
		}

		System.out.println(row.toString());
	}

	public static void EditSection() {
		int middle = section_width / 2;

		String[] sections = {
			"NAME",
			"LENGTH",
			"TYPE",
			"DIFFICULTY",
			"COMPLETED"
		};

		for (int i = 0; i < section_index.size()-1; i++) {
			int start = section_index.get(i);
			int end = section_index.get(i + 1);
			int width = end - start;
			int text_start = start + (width - sections[i].length()) / 2;

			middle_row.replace(text_start, text_start + sections[i].length(), sections[i]);
		}	
	}

	public static void TableHeaderMaker(int sections, int length) {
		table_length = length + 1; // This might break in some cases
		table_sections = sections;
		section_width = (length / sections);

		StringBuilder top_row = new StringBuilder();
		StringBuilder bottom_row = new StringBuilder();

		// Calculate sections
		for (int i = 0; i <= sections; i++) {
			section_index.add(section_width * i);
		}

		if (section_index.get(table_sections) == table_length) {
			section_index.set(table_sections, table_length);
		}

		// Make top row
		for (int i = 0; i < table_length; i++) {
			top_row.append(top_barrier_char);
		}

		// Make middle row
		for (int i = 0; i < table_length; i++) {
			middle_row.append(" ");
		}

		for (int i : section_index) {
			middle_row.replace(i, i+1, barrier_char);
		}

		EditSection();

		// Make bottom row
		for (int i = 0; i < table_length; i++) {
			bottom_row.append(top_barrier_char);
		}

		for (int i : section_index) {
			bottom_row.replace(i, i+1, barrier_char);
		}

		System.out.println(top_row);
		System.out.println(middle_row);
		System.out.println(bottom_row);
	}

	public static void TableFooterMaker() {
		StringBuilder footer = new StringBuilder();
		// Create footer
		for (int i = 0; i < table_length; i++) {
			footer.append(top_barrier_char);
		}

		for (int i : section_index) {
			footer.replace(i, i+1, barrier_char);
		}

		System.out.println(footer);
	}
}