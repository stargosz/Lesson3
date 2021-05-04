import java.util.ArrayList;
import java.util.List;


public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private static List<Employee> employees = new ArrayList<>();
    PayRoll payROll = new PayRoll();


    public Employee(String name, String lastName, double salary) {
        this.firstName = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//

    public Employee() {

    }


}
