import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class textfilereader{
    public static void main(String[] args) {
        String fileName = "\"C:\\Users\\samik\\OneDrive\\Desktop\\file.docx\""; // Replace with the actual file path

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            int vowelCount = 0;
            int wordCount = 0;
            int aCount = 0;

            while ((line = reader.readLine()) != null) {
                // Count vowels and 'a' occurrences in each line
                for (char character : line.toCharArray()) {
                    if (isVowel(character)) {
                        vowelCount++;
                    }
                    if (character == 'a' || character == 'A') {
                        aCount++;
                    }
                }

                // Count words in each line
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            reader.close();

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of occurrences of 'a': " + aCount);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
