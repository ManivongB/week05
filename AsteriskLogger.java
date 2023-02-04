package Weel5HomeWork;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String word) {
		//implements the log method in the interface to print out user word + asterisks on either side
		
		System.out.println("***" + word + "***");
		
	}
	
	/*
	 * implemnts the Error method in the interface to fill the user word with error surrounded 
	 * 
	 */

	@Override
	public void Error(String word) {
		System.out.println("****************");
		System.out.println("***Error:" + word + "***");
		System.out.println("****************");
	}

}
