// import java.util.*;
// class demo {
//     public static void main(String[] args) {
//         int salary;
//         int addBonus;

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your salary:");
//         salary=sc.nextInt();
//         if(salary>10000)
//         {
//             addBonus=salary+2000;
//             System.out.println("Salary is:"+addBonus);
//         }
//         else{
//             addBonus=salary+1000;
//             System.out.println("Salary is:"+addBonus);
//         }

//     }
// }

//Prime check

import java.util.*;
class demo 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();

        int c=2;
        while (c<num){ 
            if(num%c==0)
            {
                System.out.println("Not Prime");
            }
            else
            {
                System.out.println("Prime");
            }
        }
        c=c+1;
    }
}