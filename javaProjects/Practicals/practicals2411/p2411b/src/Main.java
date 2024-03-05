import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age = 0;
        boolean validAge = false;

        // Loop until the user enters a valid age
        while (!validAge) {
            try {
                // Ask the user for their age
                System.out.print("Enter your age as an integer: ");
                age = scanner.nextInt();
                scanner.nextLine(); // Consume the remaining newline character

                validAge = true; // Age input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer for age.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        // Display the message with the user's name and age
        System.out.println("Welcome, " + name + "! You are " + age + " years old.");
    }
}



/*
*
* Explanation:
1. We import the InputMismatchException class from the java.util package to handle invalid input for the age.
2. In the main() method, we create a new Scanner object named scanner to read user input from the keyboard.
3. We use System.out.print() to prompt the user to enter their name.
4. The scanner.nextLine() method reads a line of text entered by the user and stores it in the name variable.
5. We initialize the age variable to 0 and the validAge variable to false.
6. We use a while loop to repeatedly ask the user for their age until a valid input is provided.
7. Inside the loop, we use System.out.print() to prompt the user to enter their age as an integer.
8. The scanner.nextInt() method reads an integer entered by the user and stores it in the age variable.
9. We use scanner.nextLine() to consume the remaining newline character after reading the integer.
10. If the input is not a valid integer, an InputMismatchException is thrown and caught. An error message is displayed, and the loop continues to ask for a valid age.
11. If the input is a valid integer, the validAge variable is set to true to exit the loop.
12. Finally, we display the welcome message using System.out.println() and concatenate the user's name and age.

To run the program:
1. Save the code in a file named Main.java.
2. Open a terminal or command prompt and navigate to the directory where the file is saved.
3. Compile the program by running the command: javac Main.java
4. Run the compiled program with the command: java Main
5. Follow the prompts to enter your name and age, ensuring that you enter an integer for age. See the message with the user's name and age displayed.
*
*
* */