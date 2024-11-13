import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the file path from the user
        System.out.print("Enter the path to the text file: ");
        String filePath = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int vowelCount = 0;
            int wordCount = 0;
            int letterACount = 0;

            while ((line = reader.readLine()) != null) {
                // Count vowels
                vowelCount += countVowels(line);

                // Count words
                wordCount += countWords(line);

                // Count occurrences of 'a'
                letterACount += countOccurrences(line, 'a');
            }

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of occurrences of 'a': " + letterACount);
        } catch (IOException e) {
            System.err.println("Error reading the file. Exiting program.");
        } finally {
            scanner.close();
        }
    }

    private static int countVowels(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countOccurrences(String text, char target) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
