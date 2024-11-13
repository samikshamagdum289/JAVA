import java.util.*;

public class JaggedArray2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) 
        {
            System.out.print("Enter the number of elements in row:");
            int elements = scanner.nextInt();
            jaggedArray[i] = new int[elements];

            for (int j = 0; j < elements; j++) 
            {
                System.out.print("Enter element of row:");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nJagged Array:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < jaggedArray[i].length; j++) 
            {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
