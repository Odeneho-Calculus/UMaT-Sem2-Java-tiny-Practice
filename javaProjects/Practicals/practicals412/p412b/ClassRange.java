// Free Coffee

import java.util.Scanner;

public class ClassRange {
    public static void main(String[] args) {
        // Read marks from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        double marks = scanner.nextDouble();

        // Classify the marks into different categories
        if (marks >= 80.0) {
            System.out.println("First class");
        } else if (marks >= 70.0 && marks < 80.0) {
            System.out.println("Second class Upper");
        } else if (marks >= 60.0 && marks < 70.0) {
            System.out.println("Second class lower");
        } else if (marks >= 50.0 && marks < 60.0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Close the Scanner
        scanner.close();
    }
}

/*
 * Explanation:
 * 1. The program classifies marks into different categories based on a given range.
 * 2. The user is prompted to enter marks using a Scanner object named 'scanner'.
 * 3. The program uses if-else if statements to check the range of marks and prints the corresponding category.
 * 4. The Scanner is closed to avoid resource leaks.
 *
 * To run the program:
 * 1. Save the code in a file named ClassRange.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac ClassRange.java
 * 4. Run the compiled program with the command: java ClassRange
 * 5. Enter the marks when prompted and see the corresponding class category.
 */
