import java.util.*;
class arithmeticopr
 {
    public static void main(String[] args) 
    {
        int a, b;
       Scanner s=new Scanner(System.in); 
       System.out.println("Enter First Number: ");
       a=Integer.parseInt(s.nextLine());
       System.out.println("Enter Second Number: ");
       b=Integer.parseInt(s.nextLine());
       
       while(true)
       {
          System.out.println("Select an Option...");
          System.out.println("1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide \n 5.Exit");
          System.out.println("Type your selection here: ");
   
          String choice=s.nextLine();
          switch(choice)
          {
              case "1":
                  System.out.println("Addition = "+(a+b));
                  break;
              case "2":
                  System.out.println("Substraction = "+(a-b));
                  break;
              case "3":
                  System.out.println("Multiplication = "+(a*b));
                  break;
              case "4":
                  System.out.println("Division = "+(a/b));
                  break;
              case "5":
                  System.exit(0);
              default:
                  System.out.println("Wrong Choice!!");
                  break;
                      
                
          }
       }
    }
}
