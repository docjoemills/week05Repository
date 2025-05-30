package objectOrientedProgramming;

//SpacedLogger class implements the Logger interface
//It adds a space between each character of the message
public class SpacedLogger implements Logger {

 // Helper method to insert spaces between each character
 private String addSpaces(String message) {
     return message.chars()  // Stream of character codes
                   .mapToObj(c -> (char) c + " ") // Add a space after each character
                   .reduce("", String::concat)    // Concatenate to a single string
                   .trim();                       // Remove trailing space
 }

 // Logs the message with spaces between each character
 @Override
 public void log(String message) {
     System.out.println(addSpaces(message));
 }

 // Logs the error message with "ERROR:" followed by spaced message
 @Override
 public void error(String message) {
     System.out.println("ERROR: " + addSpaces(message));
 }
}