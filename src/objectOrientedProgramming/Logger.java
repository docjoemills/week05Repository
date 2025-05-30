package objectOrientedProgramming;

//Logger interface defining two methods that any logger class must implement
public interface Logger {
 // Method for general log output
 void log(String message);

 // Method for error output
 void error(String message);
}