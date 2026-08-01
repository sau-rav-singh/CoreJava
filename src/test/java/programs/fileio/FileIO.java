package programs.fileio;

import org.testng.Assert;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

/**
 * File I/O Operations
 *
 * Problem Statement:
 * Demonstrate different approaches for reading and writing to files using both traditional I/O and modern NIO APIs.
 *
 * Constraints:
 * - File path must be valid and writable.
 * - File must exist for append operations.
 */
public class FileIO {

    public static void main(String[] args) {
        boolean bufferSuccess = readWriteWithBuffer("src/test/resources/file3.txt");
        Assert.assertTrue(bufferSuccess, "Buffer I/O operation failed");

        boolean streamSuccess = readWriteWithStream("src/test/resources/file3.txt");
        Assert.assertTrue(streamSuccess, "Stream I/O operation failed");
    }

    /**
     * APPROACH 1: BufferedReader/Writer (Traditional I/O)
     *
     * Time Complexity: O(N)
     * - N is the total content size.
     *
     * Space Complexity: O(1)
     * - Constant buffer size.
     */
    public static boolean readWriteWithBuffer(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), StandardCharsets.UTF_8))) {
            writer.write("Hello World");
            writer.newLine();
            writer.write(String.valueOf(Math.random()));
            writer.newLine();
        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
            return false;
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * APPROACH 2: Files.lines() and Files.writeString() (Modern NIO)
     *
     * Time Complexity: O(N)
     * - N is the total content size.
     *
     * Space Complexity: O(1)
     * - Stream processing with lazy evaluation.
     */
    public static boolean readWriteWithStream(String filePath) {
        Path path = Paths.get(filePath);

        try {
            Files.writeString(path, "Hello World\n" + Math.random() + "\n", StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
            return false;
        }

        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

