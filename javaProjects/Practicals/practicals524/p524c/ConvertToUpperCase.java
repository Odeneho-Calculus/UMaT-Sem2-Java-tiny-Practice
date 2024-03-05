// Free Coffee

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        // Specify the path to your data.txt file
        String inputFilePath = "data.txt";  // Replace with the actual path

        // Specify the path for the output file (Out.txt)
        String outputFilePath = "Out.txt";  // Replace with the desired path

        // Attempt to read the file, convert to uppercase, and write to the output file
        try {
            // Create a File object representing the input file
            File inputFile = new File(inputFilePath);

            // Create a Scanner to read from the input file
            Scanner scanner = new Scanner(inputFile);

            // Create a PrintWriter to write to the output file
            PrintWriter writer = new PrintWriter(outputFilePath);

            // Read and convert each line to uppercase, then write to the output file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String uppercaseLine = line.toUpperCase();
                writer.println(uppercaseLine);
            }

            // Close the scanner and writer to release resources
            scanner.close();
            writer.close();

            // Print a success message
            System.out.println("Conversion to uppercase successful. Output written to " + outputFilePath);
        } catch (FileNotFoundException e) {
            // Handle the case where the input file is not found
            System.err.println("File not found: " + e.getMessage());
        }
    }
}

/*
 * Explanation:
 * 1. The program reads the content of a file named "data.txt" using a Scanner.
 * 2. The file path is specified with the variable 'inputFilePath'.
 * 3. Inside a try-catch block, it attempts to open the input file and read its content.
 * 4. For each line, it converts the line to uppercase and writes it to the output file.
 * 5. The output file path is specified with the variable 'outputFilePath'.
 * 6. After processing all lines, the program prints a success message.
 *
 * To run the program:
 * 1. Save the code in a file named ConvertToUpperCase.java.
 * 2. Place the data.txt file in the same directory as the Java file.
 * 3. Open a terminal or command prompt and navigate to the directory where the files are saved.
 * 4. Compile the program by running the command: javac ConvertToUpperCase.java
 * 5. Run the compiled program with the command: java ConvertToUpperCase
 * 6. See the content of the data.txt file converted to uppercase and written to Out.txt.
 */
