package programs.fileio;

import org.testng.Assert;

import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Master Study Guide Bundler
 *
 * Problem Statement:
 * Bundle all Java source files from all subpackages into a single master markdown file.
 * Includes existing GUIDE.md content if present in each subpackage.
 *
 * Constraints:
 * - Root directory must exist.
 * - Files must be readable.
 */
public class MasterStudyGuideBundler {

    private static final String INTERVIEW_PREP_PATH = "src/test/java/programs";
    private static final String OUTPUT_FILE_NAME = "programs.md";

    public static void main(String[] args) {
        boolean success = bundleAllPackages();
        Assert.assertTrue(success, "Master guide bundling failed");
    }

    /**
     * APPROACH: Files.list() with Stream API (Modern NIO)
     *
     * Time Complexity: O(N)
     * - N is the total size of all files to read.
     *
     * Space Complexity: O(N)
     * - StringBuilder accumulates all content.
     */
    public static boolean bundleAllPackages() {
        Path rootDir = Paths.get(INTERVIEW_PREP_PATH);
        Path outputFile = rootDir.resolve(OUTPUT_FILE_NAME);

        if (!Files.exists(rootDir) || !Files.isDirectory(rootDir)) {
            System.err.println("Root directory does not exist: " + rootDir.toAbsolutePath());
            return false;
        }

        StringBuilder masterContent = new StringBuilder();

        masterContent.append("# Complete Interview Prep Master Guide\n\n");
        masterContent.append("> *Generated automatically on: ").append(java.time.LocalDate.now()).append("*\n\n");
        masterContent.append("---\n\n");

        try (Stream<Path> subDirs = Files.list(rootDir)) {
            subDirs.filter(Files::isDirectory)
                    .sorted(Comparator.comparing(Path::getFileName))
                    .forEach(packageDir -> processSubpackage(packageDir, masterContent));

            Files.writeString(outputFile, masterContent.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("✅ Master guide created successfully at: " + outputFile.toAbsolutePath());
            return true;

        } catch (IOException e) {
            System.err.println("Error bundling master guide: " + e.getMessage());
            return false;
        }
    }

    private static void processSubpackage(Path packageDir, StringBuilder masterContent) {
        String packageName = packageDir.getFileName().toString();

        masterContent.append("# Topic: ").append(packageName).append("\n\n");

        Path guideFile = packageDir.resolve("GUIDE.md");
        if (Files.exists(guideFile)) {
            try {
                masterContent.append("## Notes & Concept Guide\n\n");
                masterContent.append(Files.readString(guideFile)).append("\n\n");
            } catch (IOException e) {
                System.err.println("Error reading guide in " + packageName + ": " + e.getMessage());
            }
        }

        masterContent.append("## Code Solutions\n\n");

        try (Stream<Path> files = Files.walk(packageDir, 1)) {
            files.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .sorted(Comparator.comparing(Path::getFileName))
                    .forEach(javaFile -> {
                        try {
                            String fileName = javaFile.getFileName().toString();
                            String code = Files.readString(javaFile);

                            masterContent.append("### ").append(fileName).append("\n\n");
                            masterContent.append("```java\n");
                            masterContent.append(code).append("\n");
                            masterContent.append("```\n\n");
                        } catch (IOException e) {
                            System.err.println("Error reading " + javaFile + ": " + e.getMessage());
                        }
                    });

            masterContent.append("\n---\n\n");

        } catch (IOException e) {
            System.err.println("Error traversing files in " + packageName + ": " + e.getMessage());
        }
    }
}