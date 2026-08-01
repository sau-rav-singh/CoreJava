package interview.fileio;

import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class MasterStudyGuideBundler {

    // Relative path to the InterviewPrep folder from project root
    private static final String INTERVIEW_PREP_PATH = "src/test/java/InterviewPrep";
    private static final String OUTPUT_FILE_NAME = "ALL_INTERVIEW_PREP.md";

    public static void main(String[] args) {
        bundleAllPackages();
    }

    public static void bundleAllPackages() {
        Path rootDir = Paths.get(INTERVIEW_PREP_PATH);
        Path outputFile = rootDir.resolve(OUTPUT_FILE_NAME);

        if (!Files.exists(rootDir) || !Files.isDirectory(rootDir)) {
            System.err.println("Root directory does not exist: " + rootDir.toAbsolutePath());
            return;
        }

        StringBuilder masterContent = new StringBuilder();

        // Title and Table of Contents Header
        masterContent.append("# Complete Interview Prep Master Guide\n\n");
        masterContent.append("> *Generated automatically on: ").append(java.time.LocalDate.now()).append("*\n\n");
        masterContent.append("---\n\n");

        try (Stream<Path> subDirs = Files.list(rootDir)) {
            // Process subdirectories (packages) alphabetically, ignoring non-directories
            subDirs.filter(Files::isDirectory)
                    .sorted(Comparator.comparing(Path::getFileName))
                    .forEach(packageDir -> processSubpackage(packageDir, masterContent));

            // Write the complete master content into one single Markdown file
            Files.writeString(outputFile, masterContent.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("✅ Master guide created successfully at: " + outputFile.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error bundling master guide: " + e.getMessage());
        }
    }

    private static void processSubpackage(Path packageDir, StringBuilder masterContent) {
        String packageName = packageDir.getFileName().toString();

        // Header for each main topic/subpackage
        masterContent.append("# Topic: ").append(packageName).append("\n\n");

        // 1. Process GUIDE.md if present
        Path guideFile = packageDir.resolve("GUIDE.md");
        if (Files.exists(guideFile)) {
            try {
                masterContent.append("## Notes & Concept Guide\n\n");
                masterContent.append(Files.readString(guideFile)).append("\n\n");
            } catch (IOException e) {
                System.err.println("Error reading guide in " + packageName + ": " + e.getMessage());
            }
        }

        // 2. Process Java Files
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

            masterContent.append("\n---\n\n"); // Visual separator between topics

        } catch (IOException e) {
            System.err.println("Error traversing files in " + packageName + ": " + e.getMessage());
        }
    }
}