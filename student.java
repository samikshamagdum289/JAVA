import java.lang.*;
class Student {
   protected int rollNumber;

   public Student(int rollNumber) {
       this.rollNumber = rollNumber;
   }
}

class SubjectMarks extends Student {
   protected double subject1;
   protected double subject2;

   public SubjectMarks(int rollNumber, double subject1, double subject2) {
       super(rollNumber);
       this.subject1 = subject1;
       this.subject2 = subject2;
   }
}

class Result extends SubjectMarks {
   public Result(int rollNumber, double subject1, double subject2) {
       super(rollNumber, subject1, subject2);
   }

   public void displayResult() {
       System.out.println("Roll Number: " + rollNumber);
       System.out.println("Subject 1 Marks: " + subject1);
       System.out.println("Subject 2 Marks: " + subject2);

       double average = (subject1 + subject2) / 2;
       System.out.println("Average Marks: " + average);

       if (average >= 40) {
           System.out.println("Result: Passed");
       } else {
           System.out.println("Result: Failed");
       }
   }
}

public class student {
   public static void main(String[] args) {
       // Example Usage
       Result studentResult = new Result(101, 75.5, 82.0);
       studentResult.displayResult();
   }
}
