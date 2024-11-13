import java.util.*;
class ConstructorOverloading
{
  int rn;
  String nm;
  ConstructorOverloading()
  {
  rn = 33;
  nm = "Samiksha";
  }
  ConstructorOverloading(int i,String n)
  {
  rn = i;
  nm = n;
  }
  public static void main(String args[])
 {
    ConstructorOverloading ob1 = new ConstructorOverloading();
    System.out.println("Default constructor values:");
    System.out.println("Student Roll number:"+ob1.rn+ "\nStudent Name:"+ob1.nm);

    System.out.println("\nParameterized constructor values:");
    ConstructorOverloading ob2 = new ConstructorOverloading(10,"Vaibhav"); 
    System.out.println("Student Roll number:"+ob2.rn+ "\nStudent Name:"+ob2.nm);
 }
}

/*OUTPUT:
Default constructor values:
Student Roll number:33
Student Name:Samiksha

Parameterized constructor values:
Student Roll number:10
Student Name:Vaibhav*/