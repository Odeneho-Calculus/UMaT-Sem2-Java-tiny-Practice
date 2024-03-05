// Free Coffee

public class Main {
    public static void main(String[] args) {
        // Given angle in degrees
        double degrees = 30;

        // Convert degrees to radians
        double radians = Math.toRadians(degrees);

        // Calculate and display trigonometric functions
        System.out.println("Sin(30): " + Math.sin(radians));
        System.out.println("Cos(30): " + Math.cos(radians));
        System.out.println("Tan(30): " + Math.tan(radians));
    }
}

/*
 * Explanation:
 * 1. The program calculates trigonometric functions (sin, cos, tan) for a given angle of 30 degrees.
 * 2. The Math.toRadians() method is used to convert degrees to radians.
 * 3. Math.sin(), Math.cos(), and Math.tan() functions are then applied to the angle in radians.
 * 4. The results are displayed to the user using System.out.println().
 *
 * To run the program:
 * 1. Save the code in a file named Main.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac Main.java
 * 4. Run the compiled program with the command: java Main
 * 5. See the calculated values of sin(30), cos(30), and tan(30) displayed.
 */
