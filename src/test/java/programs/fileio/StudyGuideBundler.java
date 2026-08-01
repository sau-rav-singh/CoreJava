package programs.fileio;

import org.testng.Assert;

import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Study Guide Bundler
 *
 * Problem Statement:
 * Bundle all Java source files from a subpackage into a single markdown file for study purposes.
 * Includes existing GUIDE.md content if present.
 *
 * Constraints:
 * - Target directory must exist.
 * - Files must be readable.
 */
public class StudyGuideBundler {

    private static final String BASE_PATH = "src/test/java/InterviewPrep";

    public static void main(String[] args) {
        boolean success = bundleSubpackage("Array");
        Assert.assertTrue(success, "Study guide bundling failed");
    }

    /**
     * APPROACH: Files.walk() with Stream API (Modern NIO)
     *
     * Time Complexity: O(N)
     * - N is the total size of all files to read.
     *
     * Space Complexity: O(N)
     * - StringBuilder accumulates all content.
     */
    public static boolean bundleSubpackage(String subpackageName) {
        Path targetDir = Paths.get(BASE_PATH, subpackageName);
        Path guideFile = targetDir.resolve("GUIDE.md");
        Path outputFile = targetDir.resolve("BUNDLE_" + subpackageName + ".md");

        if (!Files.exists(targetDir) || !Files.isDirectory(targetDir)) {
            System.err.println("Directory does not exist: " + targetDir.toAbsolutePath());
            return false;
        }

        StringBuilder content = new StringBuilder();

        if (Files.exists(guideFile)) {
            try {
                content.append(Files.readString(guideFile)).append("\n\n");
            } catch (IOException e) {
                System.err.println("Failed to read GUIDE.md: " + e.getMessage());
            }
        } else {
            content.append("# ").append(subpackageName).append(" Revision Guide\n\n");
        }

        content.append("---\n\n## Java Source Code Solutions\n\n");

        try (Stream<Path> paths = Files.walk(targetDir, 1)) {
            paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .sorted(Comparator.comparing(Path::getFileName))
                    .forEach(javaFile -> {
                        try {
                            String fileName = javaFile.getFileName().toString();
                            String code = Files.readString(javaFile);

                            content.append("### ").append(fileName).append("\n\n");
                            content.append("```java\n");
                            content.append(code).append("\n");
                            content.append("```\n\n");
                        } catch (IOException e) {
                            System.err.println("Could not read file: " + javaFile);
                        }
                    });

            Files.writeString(outputFile, content.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("✅ Bundled guide successfully generated: " + outputFile.toAbsolutePath());
            return true;

        } catch (IOException e) {
            System.err.println("Error processing folder: " + e.getMessage());
            return false;
        }
    }
}