class Employee {
    String empName;
    double salary;
    
    // Shared static fields
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++; // Increment counter for each object created
    }

    // Static method accessing only static fields
    public static void printCompanyInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Count: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        // Instantiate three employee objects
        Employee emp1 = new Employee("Alice", 60000);
        Employee emp2 = new Employee("Bob", 65000);
        Employee emp3 = new Employee("Charlie", 70000);

        // Call static method using the class name
        Employee.printCompanyInfo();
    }
}