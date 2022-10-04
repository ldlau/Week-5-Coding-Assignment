package objectorientedprogramming;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello!");
		logger.error("Hello!");
		
		Logger loggertwo = new SpacedLogger();
		
		loggertwo.log("October");
		loggertwo.error("October");

	}

}
