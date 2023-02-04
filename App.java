package Weel5HomeWork;

public class App {

	public static void main(String[] args) {

		// instantiating instances of our tow classes
		Logger logger = new SpacedLogger();
		Logger logger1 = new AsteriskLogger();
		
		logger.Log("Hello");
		logger.Error("Hello");
		logger1.Log("Hello");
		logger1.Error("Hello");
		
	}

}
