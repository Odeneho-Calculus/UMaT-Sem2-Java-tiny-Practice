// Free Coffee

public class NumericToChar {
    public static void main(String[] args) {
        // Given numeric values
        int num1 = 99;
        int num2 = 225;

        // Convert numeric values to characters
        char char1 = (char) num1;
        char char2 = (char) num2;

        // Display the corresponding characters
        System.out.println("Character for 99: " + char1);
        System.out.println("Character for 225: " + char2);
    }
}

/*
 * Explanation:
 * 1. The program converts numeric values to characters using explicit casting (char).
 * 2. The int values 99 and 225 are cast to char, resulting in corresponding characters.
 * 3. The results are displayed using System.out.println().
 *
 * To run the program:
 * 1. Save the code in a file named NumericToChar.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac NumericToChar.java
 * 4. Run the compiled program with the command: java NumericToChar
 * 5. See the characters corresponding to the given numeric values displayed in the console.
 */
