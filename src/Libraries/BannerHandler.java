package Libraries;

import Libraries.ConsoleHandler;
import Libraries.ColorHandler;

public class BannerHandler {
	// This file just creates the banner

	public static void CreateBanner() {
        String[] colors = ColorHandler.GetColors();
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
                    colored_banner.append(colors[3]).append(c).append(colors[16]);
                } else if (c == '/' || c == '\\' || c == '_' || c == '|') {
                    colored_banner.append(colors[7]).append(c).append(colors[16]);
                } else {
                    colored_banner.append(c);
                }
            }
            System.out.println(colored_banner);
        }
	}
}