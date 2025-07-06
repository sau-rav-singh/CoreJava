package Notion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class CompareFiles {
    public static void main(String[] args) {
        String file1 = "src/test/resources/file1.txt";
        String file2 = "src/test/resources/file2.txt";
        try (
                Stream<String> fileStream1 = Files.lines(Paths.get(file1));
                Stream<String> fileStream2 = Files.lines(Paths.get(file2))
        ) {
            Iterator<String> it1 = fileStream1.iterator();
            Iterator<String> it2 = fileStream2.iterator();
            int lineNum = 1;
            while (it1.hasNext() || it2.hasNext()) {
                String line1 = it1.hasNext() ? it1.next() : "<no line>";
                String line2 = it2.hasNext() ? it2.next() : "<no line>";
                if (!line1.equals(line2)) {
                    System.out.printf("Difference at line %d:\nFile1: %s\nFile2: %s\n\n", lineNum, line1, line2);
                }
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}