// Free Coffee

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the Celsius degree input from the user
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the conversion formula
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Display the temperature in Fahrenheit
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}

/*
 * Explanation:
 * 1. The program reads the temperature in Celsius entered by the user.
 * 2. It uses the conversion formula (Celsius to Fahrenheit) to calculate the equivalent temperature in Fahrenheit.
 * 3. The result is displayed to the user.
 *
 * To run the program:
 * 1. Save the code in a file named TemperatureConverter.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac TemperatureConverter.java
 * 4. Run the compiled program with the command: java TemperatureConverter
 * 5. Follow the prompt to enter the temperature in Celsius.
 * 6. See the result displayed, showing the temperature in Fahrenheit.
 */
