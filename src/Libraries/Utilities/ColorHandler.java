package Libraries.Utilities;

import Libraries.Utilities.OSHandler;

public class ColorHandler {

    /*
    Bright Black (Gray)   0
    Bright Red            1
    Bright Green          2
    Bright Yellow         3
    Bright Blue           4
    Bright Magenta        5
    Bright Cyan           6
    Bright White          7
    Reset                 8
    */

    private static String[] colors = {
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

	public static String GetColor(int chosen_color) {
       return colors[chosen_color];
	}
}