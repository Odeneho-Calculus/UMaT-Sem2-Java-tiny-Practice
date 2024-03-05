import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the length of the triangle
        System.out.print("Enter the length of the triangle: ");
        int length = scanner.nextInt();

        // Ask the user for the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * length * height;

        // Display the computed area of the triangle
        System.out.println("The area of the triangle is: " + area);
    }
}


/*
Explanation:
1. In the main() method, we create a new Scanner object named scanner to read user input from the keyboard.
2. We use System.out.print() to prompt the user to enter the length of the triangle.
3. The scanner.nextInt() method reads an integer entered by the user and stores it in the length variable.
4. We use System.out.print() again to prompt the user to enter the height of the triangle.
5. The scanner.nextDouble() method reads a double value entered by the user and stores it in the height variable.
6. We calculate the area of the triangle using the formula: area = 0.5 * length * height.
7. Finally, we display the computed area of the triangle using System.out.println().

To run the program:
1. Save the code in a file named Main.java.
2. Open a terminal or command prompt and navigate to the directory where the file is saved.
3. Compile the program by running the command: javac Main.java
4. Run the compiled program with the command: java Main
5. Follow the prompts to enter the length and height of the triangle.
6. See the computed area of the triangle displayed.
*/