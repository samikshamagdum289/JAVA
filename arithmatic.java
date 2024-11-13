import java.util.*;
class arithmatic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter the first number:");
        num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        num2 = sc.nextInt();

        System.out.println("We perform all arithmetic operations here:");
        
        System.out.println("Addition = "+(num1+num2));
                
        System.out.println("Substraction = "+(num1-num2));
                  
        System.out.println("Multiplication = "+(num1*num2));
                  
        System.out.println("Division = "+(num1/num2));
  }
    
}
