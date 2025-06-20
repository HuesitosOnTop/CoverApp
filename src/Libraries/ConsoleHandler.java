package Libraries;

import Libraries.ColorHandler;

public class ConsoleHandler {
	// This file is used to handle console related events

	public static void ClearConsole() {
		System.out.print("\033[H\033[2J");
	}

	public static void ColorText(int chosen_color) {
		String[] colors = ColorHandler.GetColors();

		System.out.print(colors[chosen_color]);
	}
}