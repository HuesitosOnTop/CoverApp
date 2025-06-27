package Libraries.Utilities;

import Libraries.Utilities.OSHandler;

public class ColorHandler {

    /*
    Bright Black (Gray)   1
    Bright Red            2
    Bright Green          3
    Bright Yellow         4
    Bright Blue           5
    Bright Magenta        6
    Bright Cyan           7
    Bright White          8
    Reset                 9
    */

    private static String[] win_colors = {
    "\u001B[90m", // 
    "\u001B[91m", // 
    "\u001B[92m", // 
    "\u001B[93m", // 
    "\u001B[94m", // 
    "\u001B[95m", // 
    "\u001B[96m", // 
    "\u001B[97m", // 
    "\u001B[0m"    
    };
    private static String[] lin_colors = {
    "\u001B[90m", // 
    "\u001B[91m", // 
    "\u001B[92m", // 
    "\u001B[93m", // 
    "\u001B[94m", // 
    "\u001B[95m", // 
    "\u001B[96m", // 
    "\u001B[97m", // 
    "\u001B[0m" 
    };
    private static String[] chosen_array = {};

	public static String[] GetColors() {
        String os = OSHandler.getOS();

        if (os.equals("windows")) {
            chosen_array = win_colors;
        } else {
            chosen_array = lin_colors;
        }
	}
}