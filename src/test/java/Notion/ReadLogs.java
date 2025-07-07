package Notion;

import java.io.*;
import java.nio.file.Paths;

public class ReadLogs {
    public static void main(String[] args) {
        String inputFile = "src/test/resources/application.log";
        String outputFile = "src/test/resources/error.log";
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
        }
    }
}