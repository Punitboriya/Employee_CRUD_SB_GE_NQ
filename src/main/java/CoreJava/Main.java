package CoreJava;

import java.util.HashSet;
import java.util.Objects;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a HashSet of Employees
        HashSet<Employee> employeeSet = new HashSet<>();

        // Add employees to the set
        employeeSet.add(new Employee(1, "John Doe"));
        employeeSet.add(new Employee(2, "Jane Smith"));
        employeeSet.add(new Employee(3, "Bob Johnson"));

        // Try to add a duplicate (same id and name)
        employeeSet.add(new Employee(1, "John Doe")); // Won't be added

        // Print all employees
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }
    }
}