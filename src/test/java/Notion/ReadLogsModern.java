package Notion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class ReadLogsModern {
    public static void main(String[] args) {
        Path inputFile = Paths.get("src/test/resources/application.log");
        Path outputFile = Paths.get("src/test/resources/error.log");
        try {
            List<String> errorLines = Files.lines(inputFile).filter(line -> line.contains("ERROR")).collect(Collectors.toList());
            Files.write(outputFile, errorLines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Successfully extracted error logs to: " + outputFile.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}