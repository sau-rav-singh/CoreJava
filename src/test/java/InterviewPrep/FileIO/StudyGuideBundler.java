package InterviewPrep.FileIO; // Or place it in a utility package

import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class StudyGuideBundler {

    // Update this path if necessary to match your project root
    private static final String BASE_PATH = "src/test/java/InterviewPrep";

    public static void main(String[] args) {
        // Pass the subpackage folder name here (case-sensitive to directory)
        bundleSubpackage("Array");
    }

    public static void bundleSubpackage(String subpackageName) {
        Path targetDir = Paths.get(BASE_PATH, subpackageName);
        Path guideFile = targetDir.resolve("GUIDE.md");
        Path outputFile = targetDir.resolve("BUNDLE_" + subpackageName + ".md");

        if (!Files.exists(targetDir) || !Files.isDirectory(targetDir)) {
            System.err.println("Directory does not exist: " + targetDir.toAbsolutePath());
            return;
        }

        StringBuilder content = new StringBuilder();

        // 1. Read existing GUIDE.md if it exists
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

        // 2. Iterate through all .java files and append them
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

            // 3. Write bundled output file
            Files.writeString(outputFile, content.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("✅ Bundled guide successfully generated: " + outputFile.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error processing folder: " + e.getMessage());
        }
    }
}