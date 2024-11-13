import java.util.*;
public class practice {
    public static void main(String[] args) {

        // for(int num=1;num<=10;num++)
        // System.out.println(num);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number:");
        // int n=sc.nextInt();

        // for(int num = 1 ; num <= n ; num++)
        // System.out.println(num);


        // int num = 1;
        // while(num <= 5){
        //     System.out.println(num);
        //     num++;
        // }


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter 1st number:");
        // int n1=sc.nextInt();

        // System.out.print("Enter 2nd number:");
        // int n2=sc.nextInt();

        // System.out.print("Enter 3rd number:");
        // int n3=sc.nextInt();

        // if(n1>n2 && n1>n3){
        //     System.out.println(+n1+ " is greater number");
        // }
        // else if(n2>n1 && n2>n3){
        //     System.out.println(+n2+ " is greater number");
        // }else{
        //     System.out.println(+n3+ " is greater number");
        // }



        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a character:");
        // char ch=sc.next().charAt(0);

        // if(ch>='a' && ch<='z'){
        //     System.out.println("lowercase");
        // }else{
        //      System.out.println("Uppercase");
        // }



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();

        int p=0;
        int i=1;
        int count=2;

        while (count<=n) {
            int temp=i;
            i=i+p;
            p=temp;
            count++;

            
        }
        System.out.println(i);






    }
}
