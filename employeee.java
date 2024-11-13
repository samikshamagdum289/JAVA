class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
    public double calBonus() 
    {
        return 0.1 * salary;
    }
    public void generatePerformanceReport()
    {
        System.out.println("Performance Report for " + name + ": Good");
    }
}

class Manager extends Employee 
{
    private String department;

    public Manager(String name, String address, double salary, String jobTitle, String department)
     {
        super(name, address, salary, jobTitle);
        this.department = department;
    }
    public double calBonus() 
    {
        return 0.15 * salary;
    }

    public void manageProjects() 
    {
        System.out.println("Manager " + name + " is managing projects in the " + department + " department.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    public double calBonus() 
    {
       return 0.12 * salary;
    }

    public void writeCode()
    {
        System.out.println("Developer " + name + " is writing code in " + programmingLanguage + ".");
    }
}
class Programmer extends Developer
 {
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Programmer", programmingLanguage);
    }

    // Programmer can override or add additional methods if needed
}

public class employeee
 {
    public static void main(String args[]) 
    {
        
        Manager manager = new Manager("Samruddhi Mithari", "336,Kalamba", 80000, "Manager", "IT");
        Developer developer = new Developer("Suhani shaikh", "Shahu maidan,Kolhapur", 70000, "Developer", "Java");
        Programmer programmer = new Programmer("Jaee shelar", "Rankala,Kolhapur", 75000, "C++");

        manager.displayDetails();
        System.out.println("Bonus: $" + manager.calBonus());
        manager.generatePerformanceReport();
        manager.manageProjects();

        System.out.println();

        developer.displayDetails();
        System.out.println("Bonus: $" + developer.calBonus());
        developer.generatePerformanceReport();
        developer.writeCode();

        System.out.println();

        programmer.displayDetails();
        System.out.println("Bonus: $" + programmer.calBonus());
        programmer.generatePerformanceReport();
        programmer.writeCode();
    }
}
