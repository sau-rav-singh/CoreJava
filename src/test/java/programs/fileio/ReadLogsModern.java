package programs.fileio;

import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Read and Filter Logs (Modern NIO)
 *
 * Problem Statement:
 * Read a log file using modern NIO API and extract only lines containing "ERROR" to a separate output file.
 *
 * Constraints:
 * - Input file must exist and be readable.
 * - Output file path must be writable.
 */
public class ReadLogsModern {

    public static void main(String[] args) {
        Path inputFile = Paths.get("src/test/resources/application.log");
        Path outputFile = Paths.get("src/test/resources/error.log");
        boolean success = extractErrorLogsModern(inputFile, outputFile);
        Assert.assertTrue(success, "Modern log extraction failed");
    }

    /**
     * APPROACH: Files.lines() with Stream API (Modern NIO)
     *
     * Time Complexity: O(N)
     * - N is the total number of lines in the log file.
     *
     * Space Complexity: O(M)
     * - M is the number of error lines collected.
     */
    public static boolean extractErrorLogsModern(Path inputFile, Path outputFile) {
        try {
            List<String> errorLines = Files.lines(inputFile)
                    .filter(line -> line.contains("ERROR"))
                    .collect(Collectors.toList());
            Files.write(outputFile, errorLines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Successfully extracted error logs to: " + outputFile.toAbsolutePath());
            return true;
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
