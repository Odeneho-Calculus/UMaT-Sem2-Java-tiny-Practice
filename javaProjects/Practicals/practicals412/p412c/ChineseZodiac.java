// Free Coffee

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        // Read the year from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Calculate the Zodiac animal based on the year
        int zodiac = (year - 4) % 12;

        // Use a switch statement to determine the Zodiac animal and print the result
        switch (zodiac) {
            case 0:
                System.out.println("Rat");
                break;
            case 1:
                System.out.println("Ox");
                break;
            case 2:
                System.out.println("Tiger");
                break;
            case 3:
                System.out.println("Rabbit");
                break;
            case 4:
                System.out.println("Dragon");
                break;
            case 5:
                System.out.println("Snake");
                break;
            case 6:
                System.out.println("Horse");
                break;
            case 7:
                System.out.println("Goat");
                break;
            case 8:
                System.out.println("Monkey");
                break;
            case 9:
                System.out.println("Rooster");
                break;
            case 10:
                System.out.println("Dog");
                break;
            case 11:
                System.out.println("Pig");
                break;
            default:
                System.out.println("Invalid year");
        }

        // Close the Scanner
        scanner.close();
    }
}

/*
 * Explanation:
 * 1. The program calculates the Chinese Zodiac animal based on a given year.
 * 2. The user is prompted to enter a year using a Scanner object named 'scanner'.
 * 3. The program uses a switch statement to determine the Zodiac animal based on the calculated value.
 * 4. The corresponding animal is printed using System.out.println().
 * 5. The Scanner is closed to avoid resource leaks.
 *
 * To run the program:
 * 1. Save the code in a file named ChineseZodiac.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac ChineseZodiac.java
 * 4. Run the compiled program with the command: java ChineseZodiac
 * 5. Enter a year when prompted and see the corresponding Zodiac animal.
 */
