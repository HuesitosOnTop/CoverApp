package Libraries.Utilities;

public class OSHandler {
	private static String os = "";

	// Finds the OS of the user and stores it
	public static void DetectOS() {
		String get_os = System.getProperty("os.name").toLowerCase();

		if (get_os.contains("win")) {
			os = "windows";
		} else if (get_os.contains("nix") || get_os.contains("nux") || get_os.contains("aix")) {
			os = "linux";
		} else {
			os = "unknown";
		}
	}

	// Returns the OS of the user
	public static String GetOS() {
		DetectOS();

		return os;
	}
}