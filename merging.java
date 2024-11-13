import java.util.*;
class merging
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
         int a[]=new int[5];
         int b[]=new int[5];
         int c[]=new int[10];
         int i=0,j=0,k=0,p;
       System.out.print("Enter elements of 1st array: ");
         for( p=0;p<5;p++)
         a[p]=sc.nextInt();
         Arrays.sort(a);
       System.out.print("Enter elements of 2nd array: ");
          for(p=0;p<5;p++)
          b[p]=sc.nextInt();
          Arrays.sort(b);
        while(i<5)
        {
          c[k]=a[i];
           i++;
           k++;
        }
        while(j<5)
       {
          c[k]=b[j];
            j++;
            k++;
       }
       for( k=0;k<10;k++)
       System.out.print(c[k] +" ");
    }
}

