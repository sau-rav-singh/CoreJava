package programs.fileio;

import org.testng.Assert;

import java.io.*;
import java.nio.file.Paths;

/**
 * Read and Filter Logs
 *
 * Problem Statement:
 * Read a log file and extract only lines containing "ERROR" to a separate output file.
 *
 * Constraints:
 * - Input file must exist and be readable.
 * - Output file path must be writable.
 */
public class ReadLogs {

    public static void main(String[] args) {
        String inputFile = "src/test/resources/application.log";
        String outputFile = "src/test/resources/error.log";
        boolean success = extractErrorLogs(inputFile, outputFile);
        Assert.assertTrue(success, "Log extraction failed");
    }

    /**
     * APPROACH: BufferedReader/Writer (Traditional I/O)
     *
     * Time Complexity: O(N)
     * - N is the total number of lines in the log file.
     *
     * Space Complexity: O(1)
     * - Constant buffer size.
     */
    public static boolean extractErrorLogs(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("ERROR")) {
                    writer.write(currentLine);
                    writer.newLine();
                }
            }
            System.out.println("Successfully extracted error logs to: " + Paths.get(outputFile).toAbsolutePath());
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
