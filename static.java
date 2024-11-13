import java.util.Scanner;
public class Main {
    static int static;
    static {
    System.out.println("Static block is executed.");
    static = 10;
    }
    static void staticMethod() {
    System.out.println("Static method is called.");
    System.out.println("Value of staticVariable: " +static);
    }
    public static void main(String[] args) {
    System.out.println("Value of staticVariable in main method: " + static);
    staticMethod();
    }
   }
   