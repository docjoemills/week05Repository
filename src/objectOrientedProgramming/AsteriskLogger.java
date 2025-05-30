package objectOrientedProgramming;

//asteriskLogger class implements the Logger interface
//It formats messages with asterisks
public class AsteriskLogger implements Logger {

 // Logs a message with three asterisks before and after the message
 @Override
 public void log(String message) {
     System.out.println("***" + message + "***");
 }

 // Prints the error message inside a box made of asterisks
 @Override
 public void error(String message) {
     String errorMsg = "***Error: " + message + "***";
     String border = "*".repeat(errorMsg.length());
     System.out.println(border);
     System.out.println(errorMsg);
     System.out.println(border);
 }
}