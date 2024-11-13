import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckVowel {
    public static void main(String[] args) {
        String filename = "C:\\Users\\samik\\OneDrive\\Desktop\\smpl.txt"; 
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int vowelCount = 0;
            int wordCount = 0;
            int aCount = 0;
            
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase(); 
                
                // Count vowels
                for (char c : line.toCharArray()) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowelCount++;
                        if (c == 'a') {
                            aCount++;
                        }
                    }
                }
                
                // Count words
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            
            reader.close();
            
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of times 'a' occurred: " + aCount);
            
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

/*O/P:
Number of vowels: 20
Number of words: 8
Number of times 'a' occurred: 10
*/


