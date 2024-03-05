import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first integer input from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Read the second integer input from the user
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Check if the first number is a multiple of the second number
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
    }
}


/*
*
*
Explanation:
1. In the main() method, we create a new Scanner object named scanner to read user input from the keyboard.
2. We use System.out.print() to prompt the user to enter the first integer.
3. The scanner.nextInt() method reads an integer entered by the user and stores it in the num1 variable.
4. We use System.out.print() again to prompt the user to enter the second integer.
5. The scanner.nextInt() method reads another integer entered by the user and stores it in the num2 variable.
6. We use the modulus operator % to check if the first number (num1) is divisible evenly by the second number (num2).
7. If the remainder of the division is 0, it means that num1 is a multiple of num2.
8. If num1 is a multiple of num2, we display a message indicating that fact.
9. If num1 is not a multiple of num2, we display a message indicating that fact.

To run the program:
1. Save the code in a file named MultipleChecker.java.
2. Open a terminal or command prompt and navigate to the directory where the file is saved.
3. Compile the program by running the command: javac MultipleChecker.java
4. Run the compiled program with the command: java MultipleChecker
5. Follow the prompts to enter the two integers.
6. See the result displayed indicating whether the first number is a multiple of the second number.
*
* 
*/