// Free Coffee

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read weight in kilograms from the user
        System.out.print("Enter weight in kilograms: ");
        double weightKg = input.nextDouble();

        // Read height in meters from the user
        System.out.print("Enter height in meters: ");
        double heightM = input.nextDouble();

        // Calculate BMI using the provided weight and height
        double bmi = calculateBMI(weightKg, heightM);

        // Display the calculated BMI
        System.out.println("BMI: " + bmi);

        // Interpret and display the BMI category
        interpretBMI(bmi);

        // Close the scanner
        input.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weightKg, double heightM) {
        return weightKg / (heightM * heightM);
    }

    // Method to interpret and display BMI category
    public static void interpretBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

/*
 * Explanation:
 * 1. The program prompts the user to enter weight in kilograms and height in meters.
 * 2. It calculates the BMI using the provided weight and height.
 * 3. The calculated BMI is displayed to the user.
 * 4. The BMI category (Underweight, Normal weight, Overweight, Obese) is interpreted and displayed.
 *
 * To run the program:
 * 1. Save the code in a file named BMICalculator.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac BMICalculator.java
 * 4. Run the compiled program with the command: java BMICalculator
 * 5. Follow the prompts to enter weight and height.
 * 6. See the calculated BMI and the corresponding BMI category displayed.
 */
