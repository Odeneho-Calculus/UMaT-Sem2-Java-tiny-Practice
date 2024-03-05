// Free Coffee

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileContent {
    public static void main(String[] args) {
        // Specify the path to your data.txt file
        String filePath = "data.txt";  // Replace with the actual path

        // Attempt to read the file and print its content
        try {
            // Create a File object representing the specified file path
            File file = new File(filePath);

            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(file);

            // Read and print each line of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the scanner to release resources
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.err.println("File not found: " + e.getMessage());
        }
    }
}

/*
 * Explanation:
 * 1. The program reads the content of a file named "data.txt" using a Scanner.
 * 2. The file path is specified with the variable 'filePath'.
 * 3. Inside a try-catch block, it attempts to open the file and read its content.
 * 4. The while loop reads and prints each line of the file until there are no more lines.
 * 5. If the file is not found, a FileNotFoundException is caught and an error message is displayed.
 *
 * To run the program:
 * 1. Save the code in a file named ReadFileContent.java.
 * 2. Place the data.txt file in the same directory as the Java file.
 * 3. Open a terminal or command prompt and navigate to the directory where the files are saved.
 * 4. Compile the program by running the command: javac ReadFileContent.java
 * 5. Run the compiled program with the command: java ReadFileContent
 * 6. See the content of the data.txt file printed in the console.
 */
