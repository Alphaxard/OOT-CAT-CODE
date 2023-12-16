package hms;


import java.time.LocalDate;
import java.util.Scanner;

class Employee extends Person implements DataCapturable{
    private String employeeId;
    private LocalDate hireDate;
    private double salary;

    // Default constructor
    public Employee() {
        // Call the default constructor of the base class (Person)
        super();
    }

    // Parameterized constructor
    public Employee(
            String name,
            String contactNumber,
            String address,
            String email,
            LocalDate dateOfBirth,
            String gender,
            String idNumber,
            //String socialMediaHandle,
            String emergencyContact,
            String employeeId,
            LocalDate hireDate,
            double salary
    ) {
        // Call the parameterized constructor of the base class (Person)
        super(name, contactNumber, address, email, dateOfBirth, gender, idNumber,emergencyContact);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    // Getter and Setter methods for Employee attributes
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override displayAllData method to include Employee attributes
    @Override
    public void displayAllData() {
        super.displayAllData(); // Call the displayAllData method of the base class (Person)
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Hire Date: " + getHireDate());
        System.out.println("Salary: " + getSalary());
        // Display other attributes as needed
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        // Capture all data from the user
        employee.captureAllData();

        // Capture additional data for Employee
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        employee.setEmployeeId(scanner.nextLine());

        System.out.print("Enter Hire Date (YYYY-MM-DD): ");
        try {
            employee.setHireDate(LocalDate.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Invalid date format. Setting Hire Date to null.");
        }

        System.out.print("Enter Salary: ");
        employee.setSalary(scanner.nextDouble());

        // Close the scanner to prevent resource leak
        scanner.close();

        // Display all captured data for Employee
        employee.displayAllData();
    }
}