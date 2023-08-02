package week5;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger Logger = new SpacedLogger();
		

		logger.log("Peanut");
		logger.error("Butter");
		
		Logger.log("And");
		Logger.error("Jelly");
		
	}

}
