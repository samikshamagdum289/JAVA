import java.util.*;
class sortascending 
{
 public static void main(String args[])
 {
    int a[] = new int [5],i;
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the elements:");
    for(i=0;i<5;i++)

    a[i] =sc.nextInt();
    Arrays.sort(a);
    System.out.println("Sorted array:");
    for(i=0;i<5;i++)
    System.out.println(a[i]);
 }   
}
