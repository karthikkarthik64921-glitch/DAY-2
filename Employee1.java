abstract class Employee {
    String name;
    int empID;
    private double salary;

    Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    abstract void calculateSalary();

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empID);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, int empID, double salary) {
        super(name, empID, salary);
    }

    void calculateSalary() {
        System.out.println("Full Time Salary: " + getSalary());
    }
}

class PartTimeEmployee extends Employee {

    int hours;
    double rate;

    PartTimeEmployee(String name, int empID, int hours, double rate) {
        super(name, empID, 0);
        this.hours = hours;
        this.rate = rate;
    }

    void calculateSalary() {
        double total = hours * rate;
        System.out.println("Part Time Salary: " + total);
    }
}

class Main {
    public static void main(String[] args) {

        Employee e;

        FullTimeEmployee f = new FullTimeEmployee("Karthik", 101, 50000);

        PartTimeEmployee p = new PartTimeEmployee("Upendra", 102, 5, 500);

        e = f;
        e.display();
        e.calculateSalary();

        System.out.println("-------------------");

        e = p;
        e.display();
        e.calculateSalary();
    }
}