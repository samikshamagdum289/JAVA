import java.util.*;
class stuinfo
{
  int rollno;
  String name;
 Scanner sc = new Scanner(System.in);
  void get()
  {
   
    System.out.print("Enter roll number:"); 
    rollno=sc.nextInt();

   System.out.println("Enter name:");
    name=sc.nextLine();
  }
 void put()
 {
    System.out.println("Roll no.:"+rollno);
    System.out.println("Name:"+name);
 }
 public static void main(String args[])
 {
    stuinfo s=new stuinfo();
    s.get();
    s.put();
 }   
}