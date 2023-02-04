package Weel5HomeWork;

public class SpacedLogger implements Logger {
	/** Creates a variable spacedWord to hold the word entered then add a space after each Char
	and prints out spacedWord**/
	 
	
	@Override
	public void Log(String word) {
		
		String spacedWord = "";
		for(int i = 0; i < word.length(); i++) {
			spacedWord+= word.charAt(i) + " ";
		}
		System.out.println(spacedWord);
	}

	/* Displays an error message of the word spaced out with Error in front
	 * then prints the message to the console */ 
	 
	
	@Override
	public void Error(String word) {
		
		String spacedWord = "";
		for(int i = 0; i < word.length(); i++) {
			spacedWord += word.charAt(i) + " ";
		}
		System.out.println("ERROR: " + spacedWord);
	}

}
