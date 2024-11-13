import java.util.*;

public class SetOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input set A
        System.out.print("Enter elements of set A : ");
        String[] setAInput = scanner.nextLine().split("\\s+");
        Set<String> setA = new HashSet<>(Arrays.asList(setAInput));
        
        // Input set B
        System.out.print("Enter elements of set B : ");
        String[] setBInput = scanner.nextLine().split("\\s+");
        Set<String> setB = new HashSet<>(Arrays.asList(setBInput));
        
        // Union
        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);
        
        // Intersection
        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        
        // Output
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        
        scanner.close();
    }
}
/*Output:
 Enter elements of set A : 1 4 7 9
Enter elements of set B : 2 5 6 1 7 3 9
Union: [1, 2, 3, 4, 5, 6, 7, 9]
Intersection: [1, 7, 9]
 */