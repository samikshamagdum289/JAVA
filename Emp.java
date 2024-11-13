public class Emp 
{
    String name;
    int employeeid;
    String category;
    double bpay, hra, da, npay, pf, grosspay, incometax, allowance;

  
    public Emp(String name, int empid, String category, double bpay) 
    {
        this.name = name;
        this.employeeid = empid;
        this.category = category;
        this.bpay = bpay;
    }
   public void calculateSalary()
   {
        da = 0.05 * bpay;
        hra = 0.09 * bpay;
        allowance = 0.1 * bpay;
        pf = 0.11 * bpay;
        grosspay = bpay + da + hra + allowance;
        incometax = 0.1 * grosspay;
        npay = grosspay - (pf + incometax);
    }
    public void displayDetails()
    {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Category: " + category);
        System.out.println("\nSalary Details:");
        System.out.println("Basic Pay: " + bpay);
        System.out.println("Dearness Allowance: " + da);
        System.out.println("House Rent Allowance: " + hra);
        System.out.println("Allowance: " + allowance);
        System.out.println("Provident Fund: " + pf);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Income Tax: " + incometax);
        System.out.println("Net Pay: " + npay);
    }
}
