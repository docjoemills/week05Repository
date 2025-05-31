# 🪵 Logger Interface Implementation (Java OOP Project)

This Java project demonstrates basic principles of **object-oriented programming** using interfaces and polymorphism. It defines a common `Logger` interface and two distinct logger implementations: `AsteriskLogger` and `SpacedLogger`. Each class provides a unique formatting style for logging and error messages.

---

## 📦 Project Structure

objectOrientedProgramming/
├── App.java
├── AsteriskLogger.java
├── SpacedLogger.java
└── Logger.java

yaml
Copy
Edit

- `Logger.java`: Interface that defines two methods — `log(String message)` and `error(String message)`.
- `AsteriskLogger.java`: Implementation of `Logger` that wraps messages in asterisks and outputs boxed error messages.
- `SpacedLogger.java`: Implementation of `Logger` that inserts spaces between each character.
- `App.java`: Contains the `main` method that tests both logger implementations.

---

## 💡 Key OOP Concepts Demonstrated

- **Interfaces**: Common contract for all logger types.
- **Polymorphism**: Both logger implementations are accessed through the `Logger` interface.
- **Encapsulation**: Each class encapsulates its own formatting logic.
- **Clean Code Practices**: Consistent naming, meaningful comments, and single-responsibility methods.

---

## 🧪 Sample Output

```text
Asterisk Logger – Log:
***Hello***

Asterisk Logger – Error:
******************
***Error: Hello***
******************

Spaced Logger – Log:
W o r l d

Spaced Logger – Error:
ERROR: W o r l d
🚀 How to Run
Clone or download the project into your local development environment.

Open it in your Java IDE (e.g., Eclipse, IntelliJ, VS Code with Java extension).

Compile and run App.java.

Observe the formatted output from both logger classes in the console.

🛠️ Possible Enhancements
Add a FileLogger that writes logs to a text file.

Implement log levels (INFO, WARN, ERROR).

Add a timestamp to each log message.

Refactor with Java's Logger framework for real-world extensibility.

📚 Educational Value
This project is ideal for beginners learning:

How to define and implement interfaces

The basics of Java class structures and method overriding

How to abstract behavior and apply OOP principles in practice

👨‍💻 Author
Created by [Your Name Here] as part of the Promineo Tech Java Backend Development course.

📝 License
This project is open-source and free to use for educational purposes.

vbnet
Copy
Edit

Let me know if you'd like to include screenshots, a UML diagram, or convert this into a GitHub-friendly format with badges and contribution instructions.
