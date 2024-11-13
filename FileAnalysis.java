import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalysis {
    public static void main(String[] args) {
        try {
            // Provide the path to your text file
            String filePath = "path/to/your/textfile.txt";

            // Read the file and perform analysis
            int vowelCount = 0;
            int wordCount = 0;
            int aCount = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    // Count vowels and 'a'
                    for (char ch : line.toLowerCase().toCharArray()) {
                        if (isVowel(ch)) {
                            vowelCount++;
                        }
                        if (ch == 'a') {
                            aCount++;
                        }
                    }

                    // Count words
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }

            // Display the results
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of occurrences of 'a': " + aCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
