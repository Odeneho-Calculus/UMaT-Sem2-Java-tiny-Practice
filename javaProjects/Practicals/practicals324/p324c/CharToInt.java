// Free Coffee

public class CharToInt {
    public static void main(String[] args) {
        // Given characters
        char ch1 = 'A';
        char ch2 = '!';
        char ch3 = '*';
        char ch4 = 'i';

        // Convert characters to integers
        int int1 = (int) ch1;
        int int2 = (int) ch2;
        int int3 = (int) ch3;
        int int4 = (int) ch4;

        // Display the corresponding integers
        System.out.println("Integer for A: " + int1);
        System.out.println("Integer for !: " + int2);
        System.out.println("Integer for *: " + int3);
        System.out.println("Integer for i: " + int4);
    }
}

/*
 * Explanation:
 * 1. The program converts characters to integers using explicit casting (int).
 * 2. The char values 'A', '!', '*', and 'i' are cast to int, resulting in their ASCII values.
 * 3. The results are displayed using System.out.println().
 *
 * To run the program:
 * 1. Save the code in a file named CharToInt.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac CharToInt.java
 * 4. Run the compiled program with the command: java CharToInt
 * 5. See the ASCII values corresponding to the given characters displayed in the console.
 */
