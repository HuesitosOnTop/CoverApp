package Libraries.Utilities;

// THIS IS A WIP

public class ColorHandler {

    /*
    COLOR CODES
    0. Black
    1. Red
    2. Green
    3. Yellow
    4. Blue
    5. Magenta
    6. Cyan
    7. White
    8. Reset
    */

    private static String[] colors = 
    {
    "\u001B[90m", 
    "\u001B[91m",  
    "\u001B[92m",  
    "\u001B[93m",  
    "\u001B[94m",  
    "\u001B[95m",  
    "\u001B[96m",  
    "\u001B[97m", 
    "\u001B[39m"
    };

	public static String GetColor(int chosen_color) {
        return colors[chosen_color];
	}
}