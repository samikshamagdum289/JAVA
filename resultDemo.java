interface Sports { 
    void setSmarks(int marks); } 
    class Student { 
    private int rollNo;
     public int getRollNo(){ 
    return rollNo;
     } 
     public void setRollNo(int rollNo) { 
    this.rollNo = rollNo;
    }} 
     class Test extends Student { 
     int sub1;
     int sub2;
     public int getSub1() { 
     return sub1;
     } 
     public void setSub1(int sub1) { 
     this.sub1 = sub1;
     } 
     public int getSub2() { 
     return sub2;
     } 
     public void setSub2(int sub2){ 
     this.sub2 = sub2;
     } 
     public int getMarks(){ 
     return sub1 + sub2;
     } 
     public void setMarks(int sub1, int sub2) { 
     this.sub1 = sub1;
     this.sub2 = sub2;
     } 
     } 
    class Result extends Test implements Sports { 
    int smarks;
     public void setSmarks(int marks){ 
     this.smarks = marks;
    } 
     public void displayResult() { 
     int totalMarks = getMarks() + smarks;
    System.out.println("Roll Number: " + getRollNo());
    System.out.println("Subject 1 Marks: " + getSub1());
    System.out.println("Subject 2 Marks: " + getSub2());
    System.out.println("Sports Marks: " + smarks);
    System.out.println("Total Marks: " + totalMarks);
     } 
    } 
    public class resultDemo{ 
     public static void main(String[] args) { 
    Result Re = new Result();
     Re.setRollNo(101);
     Re.setMarks(75, 80);
     Re.setSmarks(10);
     Re.displayResult();
     } 
    } 
