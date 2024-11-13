public class Employee
{
    private String fN;
    private String lN;
    private double monthlySalary;
 
   public Employee(String fN, String lN, double monthlySalary)
    {
        this.fN = fN;
        this.lN = lN;

        if (monthlySalary >= 0)
        {
            this.monthlySalary = monthlySalary;
        } 
        else
        {
           
            System.out.println("Invalid monthly salary. Setting salary to 0.");
            this.monthlySalary = 0;
        }
    }

   
    public String getFirstName() {
        return fN;
    }

    public void setFirstName(String firstName) {
        this.fN = firstName;
    }

    
    public String getLastName() {
        return lN;
    }

    public void setLastName(String lastName) {
        this.lN= lastName;
    }

    
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        } else {
           
            System.out.println("Invalid monthly salary. Setting salary to 0.");
            this.monthlySalary = 0;
        }
    }

    
    public double calculateYearlySalary() {
        return monthlySalary * 12;
    }

    
    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            double raiseAmount = monthlySalary * (percentage / 100);
            monthlySalary += raiseAmount;
            System.out.println("Salary raised by " + percentage + "%. New monthly salary: $" + monthlySalary);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

       public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + fN + " " + lN);
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Yearly Salary: $" + calculateYearlySalary());
    }

    public static void main(String[] args) {
       
        Employee employee = new Employee("Samiksha", "Magdum", 5000.0);
        employee.displayEmployeeInfo();

        
        employee.raiseSalary(10);
        employee.displayEmployeeInfo();
    }
}
