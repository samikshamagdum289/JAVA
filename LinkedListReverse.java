import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class LinkedListReverse {
    public static void main(String[] args) {
        String str = "";
        LinkedList<String> list = new LinkedList<String>();
        try {
            FileReader fr = new FileReader("C:\\Users\\samik\\OneDrive\\Desktop\\smpl.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                list.add(str);
            }
            System.out.println("Original LinkedList: " + list);
            Collections.reverse(list);
            System.out.println("Reversed LinkedList:");
            for (String str1 : list) {
                System.out.println(str1);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
