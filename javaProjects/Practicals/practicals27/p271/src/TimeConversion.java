// Free Coffee

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter time in seconds
        System.out.print("Enter time in seconds: ");
        int timeInSeconds = scanner.nextInt();

        // Convert time to minutes and seconds
        int minutes = timeInSeconds / 60;
        int seconds = timeInSeconds % 60;

        // Display the conversion to the user
        System.out.println("The time is: " + minutes + " minutes and " + seconds + " seconds.");
    }
}

/*
 * Explanation:
 * 1. The program prompts the user to enter the time in seconds.
 * 2. It reads the input using a Scanner object named scanner.
 * 3. The entered time in seconds is converted to minutes and seconds.
 * 4. The conversion is displayed to the user, showing the minutes and remaining seconds.
 *
 * To run the program:
 * 1. Save the code in a file named TimeConversion.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac TimeConversion.java
 * 4. Run the compiled program with the command: java TimeConversion
 * 5. Follow the prompt to enter the time in seconds.
 * 6. See the conversion to minutes and seconds displayed.
 */
