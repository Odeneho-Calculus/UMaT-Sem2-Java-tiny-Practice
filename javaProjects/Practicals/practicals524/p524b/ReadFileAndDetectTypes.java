// Free Coffee

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileAndDetectTypes {
    public static void main(String[] args) {
        // Specify the path to your data.txt file
        String filePath = "data.txt";  // Replace with the actual path

        // Attempt to read the file and print its content with data types
        try {
            // Create a File object representing the specified file path
            File file = new File(filePath);

            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(file);

            // Read the header to get column names
            if (scanner.hasNextLine()) {
                String header = scanner.nextLine();
                String[] columnNames = header.split("\\s+");

                // Read and print each line of the file
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] values = line.split("\\s+");

                    // Print values with their respective types
                    for (int i = 0; i < values.length; i++) {
                        String columnName = columnNames[i];
                        String value = values[i];

                        determineAndPrintType(columnName, value);
                    }
                }
            }

            // Close the scanner to release resources
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.err.println("File not found: " + e.getMessage());
        }
    }

    private static void determineAndPrintType(String columnName, String value) {
        System.out.print(columnName + ": ");
        if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
            System.out.println("boolean");
        } else {
            try {
                // Try to parse the value as a double
                Double.parseDouble(value);
                System.out.println("double");
            } catch (NumberFormatException e) {
                // If it's not a boolean or a double, consider it a string
                System.out.println("String");
            }
        }
    }
}

/*
 * Explanation:
 * 1. The program reads the content of a file named "data.txt" using a Scanner.
 * 2. The file path is specified with the variable 'filePath'.
 * 3. Inside a try-catch block, it attempts to open the file and read its content.
 * 4. The header is read to obtain column names, assuming the first line contains headers.
 * 5. Each subsequent line is split into values based on whitespace, assuming a space-separated format.
 * 6. The determineAndPrintType method is called for each value, printing the column name and its type.
 * 7. The determineAndPrintType method checks if the value is a boolean, double, or a string.
 *
 * To run the program:
 * 1. Save the code in a file named ReadFileAndDetectTypes.java.
 * 2. Place the data.txt file in the same directory as the Java file.
 * 3. Open a terminal or command prompt and navigate to the directory where the files are saved.
 * 4. Compile the program by running the command: javac ReadFileAndDetectTypes.java
 * 5. Run the compiled program with the command: java ReadFileAndDetectTypes
 * 6. See the content of the data.txt file with detected data types printed in the console.
 */
