package programs.fileio;

import org.testng.Assert;

import java.io.*;

/**
 * Append to File
 *
 * Problem Statement:
 * Append text content to an existing file and then read the file to verify the content.
 *
 * Constraints:
 * - File path must be valid and writable.
 * - File must exist for append operation.
 */
public class AppendFile {

    public static void main(String[] args) {
        String text = "Welcome to GeeksforGeeks\nHappy Learning!";
        String filePath = "src/test/resources/file3.txt";

        boolean appendSuccess = appendToFile(filePath, text);
        Assert.assertTrue(appendSuccess, "File append operation failed");
    }

    /**
     * APPROACH: BufferedWriter with FileReader (Optimal)
     *
     * Time Complexity: O(N)
     * - N is the length of text to append.
     *
     * Space Complexity: O(1)
     * - Constant buffer size.
     */
    public static boolean appendToFile(String filePath, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(text);
            System.out.println("Successfully appended to the file: " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while appending to the file.");
            e.printStackTrace();
            return false;
        }

        System.out.println("\n--- Reading file contents ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
