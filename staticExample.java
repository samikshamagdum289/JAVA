import java.util.*;
public class staticExample
 {
    static int staticVariable;
    static 
    {
        System.out.println("This is a static block.");
        staticVariable = 100;
    }
    static void staticMethod() 
    {
        System.out.println("This is a static method.");
        System.out.println("Static variable value: " + staticVariable);
    }
     public static void main(String args[]) 
     {
        System.out.println("Accessing static variable directly: " + staticExample.staticVariable);
        staticExample.staticMethod();
    }
}
