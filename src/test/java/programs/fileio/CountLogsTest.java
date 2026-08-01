package programs.fileio;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Count and Analyze Logs
 *
 * Problem Statement:
 * Analyze log files to count log levels by frequency and find the longest line in a file.
 *
 * Constraints:
 * - Input file must exist and be readable.
 * - Log format must be consistent for level extraction.
 */
public class CountLogsTest {

    @Test
    public void countLogLevelsBufferedTest() {
        Path path = Paths.get("src/test/resources/application.log");
        Map<String, Integer> logLevels = countLogLevelsBuffered(path);
        Assert.assertNotNull(logLevels, "Log levels map should not be null");
        System.out.println(logLevels);
    }

    @Test
    public void countLogLevelsTest() {
        Path path = Paths.get("src/test/resources/application.log");
        Map<String, Long> logLevels = countLogLevels(path);
        Assert.assertNotNull(logLevels, "Log levels map should not be null");
        System.out.println(logLevels);
    }

    @Test
    public void findLongestLineTest() {
        Path path = Paths.get("src/test/resources/emp.txt");
        Optional<String> longestLine = findLongestLine(path);
        Assert.assertTrue(longestLine.isPresent(), "Should find a longest line");
        longestLine.ifPresent(line -> {
            System.out.println("Longest Line:");
            System.out.println(line);
            System.out.println("\nLength:");
            System.out.println(line.length());
        });
    }

    /**
     * APPROACH 1: Stream API with Collectors (Modern NIO)
     *
     * Time Complexity: O(N)
     * - N is the total number of lines.
     *
     * Space Complexity: O(K)
     * - K is the number of unique log levels.
     */
    public static Map<String, Long> countLogLevels(Path path) {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .map(String::trim)
                    .filter(line -> !line.isEmpty())
                    .map(line -> line.split("\\s+")[2])
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read log file", e);
        }
    }

    /**
     * APPROACH 2: Stream with Comparator (Modern NIO)
     *
     * Time Complexity: O(N)
     * - N is the total number of lines.
     *
     * Space Complexity: O(1)
     * - Constant space for comparison.
     */
    public static Optional<String> findLongestLine(Path path) {
        try (Stream<String> lines = Files.lines(path)) {
            return lines.max(Comparator.comparingInt(String::length));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read lines for longest line check", e);
        }
    }

    /**
     * APPROACH 3: BufferedReader (Traditional I/O)
     *
     * Time Complexity: O(N)
     * - N is the total number of lines.
     *
     * Space Complexity: O(K)
     * - K is the number of unique log levels.
     */
    public static Map<String, Integer> countLogLevelsBuffered(Path path) {
        Map<String, Integer> counts = new HashMap<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String level = line.split("\\s+")[2];
                counts.merge(level, 1, Integer::sum);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return counts;
    }
}

