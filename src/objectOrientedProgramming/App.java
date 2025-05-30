package objectOrientedProgramming;

//App class with the main method to test both logger implementations
public class App {
	public static void main(String[] args) {
	        Logger asteriskLogger = new AsteriskLogger();
	        Logger spacedLogger = new SpacedLogger();

	        System.out.println("Asterisk Logger – Log:");
	        asteriskLogger.log("Hello");

	        System.out.println("\nAsterisk Logger – Error:");
	        asteriskLogger.error("Hello");

	        System.out.println("\nSpaced Logger – Log:");
	        spacedLogger.log("World");

	        System.out.println("\nSpaced Logger – Error:");
	        spacedLogger.error("World");
	}
}