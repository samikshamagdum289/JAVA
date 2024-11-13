import java.util.*;
public class JaggedArray
{  
    public static void main(String[] args) 
    {  
        int[][] jaggedArray = 
        {  
            {9, 3, 6},     
            {8, 5},        
            {7, 2, 6, 9},
            {4 , 8 , 9 , 3 ,2 , 7}   
        };  
          for (int i = 0; i < jaggedArray.length; i++) 
          {  
            for (int j = 0; j < jaggedArray[i].length; j++) 
            {  
                System.out.print(jaggedArray[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}
/*OUTPUT:
9 3 6 
8 5
7 2 6 9
4 8 9 3 2 7 */