package Libraries.Utilities;

// THIS IS A WIP

public class ColorHandler {
    /*
    WINDOWS COLORS
    Black                 0
    Red                   1 
    Green                 2
    Yellow                3
    Blue                  4
    Magenta               5
    Cyan                  6
    White                 7
    Bright Black (Gray)   8
    Bright Red            9
    Bright Green         10
    Bright Yellow        11
    Bright Blue          12
    Bright Magenta       13
    Bright Cyan          14
    Bright White         15
    Reset                16
    */

    private static String[] win_colors = 
    {
    "\u001B[30m", 
    "\u001B[31m", // 
    "\u001B[32m", // 
    "\u001B[33m", // 
    "\u001B[34m", // 
    "\u001B[35m", // 
    "\u001B[36m", // 
    "\u001B[37m", // 
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
    private static String[] lin_colors = 
    {
        "hi"
    };
    private static String[] chosen_array = {};

	public static void GetColors() {
        // CHANGE RETURN TYPE FROM A VOID TO STRING ARRAY

	}
}