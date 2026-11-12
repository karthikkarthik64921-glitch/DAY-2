import java.util.Scanner;

class Employee {

    // Private data members
    private String name;
    private int emp_id;
    private double salary;

    private final String password = "admin123";

    // Constructor
    Employee(String name, int emp_id, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmpId() {
        return emp_id;
    }

    public double getSalary() {
        return salary;
    }

    // Authentication
    private boolean authenticate(String pass) {
        return password.equals(pass);
    }

    // Display employee details
    public void displayDetails(String pass) {
        if (authenticate(pass)) {
            System.out.println("\n--- Employee Details ---");
            System.out.println("Name: " + getName());
            System.out.println("Employee ID: " + getEmpId());
            System.out.println("Salary: " + getSalary());
        } else {
            System.out.println("Access Denied!");
        }
    }

    // Update employee details
    public void updateDetails(String pass, Scanner sc) {
        if (authenticate(pass)) {

            System.out.print("Enter new name: ");
            setName(sc.nextLine());

            System.out.print("Enter new Employee ID: ");
            setEmpId(sc.nextInt());

            System.out.print("Enter new salary: ");
            setSalary(sc.nextDouble());

            System.out.println("Details updated successfully!");

        } else {
            System.out.println("Access Denied!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee("Rahul", 101, 30000);

        System.out.print("Enter Admin Password: ");
        String pass = sc.nextLine();

        System.out.println("\n1. Display Details");
        System.out.println("2. Update Details");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            emp.displayDetails(pass);
        } else if (choice == 2) {
            emp.updateDetails(pass, sc);
            emp.displayDetails(pass);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}