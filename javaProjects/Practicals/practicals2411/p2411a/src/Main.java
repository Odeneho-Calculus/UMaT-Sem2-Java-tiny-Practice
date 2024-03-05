import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the welcome message
        System.out.println("Welcome, " + name + "!");
    }
}



/*
*
  Code Explanation:
1. We import the Scanner class from the java.util package.
2. In the main() method, we create a new Scanner object named scanner to read user input from the keyboard.
3. We use System.out.print() to prompt the user to enter their name.
4. The scanner.nextLine() method reads a line of text entered by the user and stores it in the name variable.
5. Finally, we display the welcome message using System.out.println() and concatenate the user's name with the message.
*
*
  To run the program:
1. Save the code in a file named Main.java.
2. Open a terminal or command prompt and navigate to the directory where the file is saved.
3. Compile the program by running the command: javac Main.java
4. Run the compiled program with the command: java Main
5. Follow the prompts to enter your name and see the welcome message displayed.*/