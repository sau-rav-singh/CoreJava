package Notion;

import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        String text = "Welcome to GeeksforGeeks\nHappy Learning!";
        String filePath = "src/test/resources/file3.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(text);
            System.out.println("Successfully appended to the file: " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }

        System.out.println("\n--- Reading file contents ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}