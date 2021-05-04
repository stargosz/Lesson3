import java.util.ArrayList;
import java.util.List;


public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private static List<Employee> employees = new ArrayList<>();

    public Employee(String name, String lastName, double salary) {
        this.firstName = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public double getSalary() {
        return salary;
    }


}
