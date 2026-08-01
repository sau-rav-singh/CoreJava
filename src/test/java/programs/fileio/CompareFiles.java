package programs.fileio;

import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Compare Files
 *
 * Problem Statement:
 * Compare two text files line by line and report any differences found.
 *
 * Constraints:
 * - Both file paths must be valid and readable.
 * - Files should be text files.
 */
public class CompareFiles {

    public static void main(String[] args) {
        String file1 = "src/test/resources/file1.txt";
        String file2 = "src/test/resources/file2.txt";
        boolean comparisonSuccess = compareFiles(file1, file2);
        Assert.assertTrue(comparisonSuccess, "File comparison failed");
    }

    /**
     * APPROACH: Stream API with Iterators (Optimal)
     *
     * Time Complexity: O(N)
     * - N is the total number of lines in both files.
     *
     * Space Complexity: O(1)
     * - Constant space for iterators.
     */
    public static boolean compareFiles(String file1, String file2) {
        try (
                Stream<String> fileStream1 = Files.lines(Paths.get(file1));
                Stream<String> fileStream2 = Files.lines(Paths.get(file2))
        ) {
            Iterator<String> it1 = fileStream1.iterator();
            Iterator<String> it2 = fileStream2.iterator();
            int lineNum = 1;
            boolean hasDifferences = false;

            while (it1.hasNext() || it2.hasNext()) {
                String line1 = it1.hasNext() ? it1.next() : "<no line>";
                String line2 = it2.hasNext() ? it2.next() : "<no line>";
                if (!line1.equals(line2)) {
                    System.out.printf("Difference at line %d:\nFile1: %s\nFile2: %s\n\n", lineNum, line1, line2);
                    hasDifferences = true;
                }
                lineNum++;
            }

            if (!hasDifferences) {
                System.out.println("Files are identical.");
            }
            return true;

        } catch (IOException e) {
            System.err.println("Error comparing files: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
