package Libraries.Utilities;

import Libraries.Utilities.ConsoleHandler;
import Libraries.Utilities.ColorHandler;

public class BannerHandler {
	// This file just creates the banner

	public static void CreateBanner() {
        final String yellow = ColorHandler.GetColor(3);
        final String white = ColorHandler.GetColor(7);
        final String reset = ColorHandler.GetColor(8);


		String[] banner = {
			" /$$$$$$$             /$$$$$$  /$$                                 /$$",
			"| $$__  $$           /$$__  $$| $$                                | $$",
			"| $$  \\ $$  /$$$$$$ | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$   /$$$$$$$",
			"| $$$$$$$/ /$$__  $$| $$      | $$__  $$ /$$__  $$ /$$__  $$ /$$__  $$",
			"| $$__  $$| $$$$$$$$| $$      | $$  \\ $$| $$  \\ $$| $$  \\__/| $$  | $$",
			"| $$  \\ $$| $$_____/| $$    $$| $$  | $$| $$  | $$| $$      | $$  | $$",
			"| $$  | $$|  $$$$$$$|  $$$$$$/| $$  | $$|  $$$$$$/| $$      |  $$$$$$$",
			"|__/  |__/ \\_______/ \\______/ |__/  |__/ \\______/ |__/       \\_______/",};

		for (String line : banner) {
            StringBuilder colored_banner = new StringBuilder();
            for (char c : line.toCharArray()) {
                if (c == '$') {
                    colored_banner.append(yellow).append(c).append(reset);
                } else if (c == '/' || c == '\\' || c == '_' || c == '|') {
                    colored_banner.append(white).append(c).append(reset);
                } else {
                    colored_banner.append(c);
                }
            }
            System.out.println(colored_banner);
        }
	}
}