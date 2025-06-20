package Libraries;

public class ArrayHandler {
	// This file is used to handle array-specific tasks

	public static void listArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println((i+1) + ". " + array[i]);
		}
		System.out.println("");
	}
}