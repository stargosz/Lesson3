import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayRoll {
    private static int rows = 5;
    private static String firstName;
    private static String lastName;
    private static double salary;
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter employee's first name, last name and salary: ");
        for (int i = 0; i < rows; i++) {
            System.out.println("First name of " + (i + 1) + " employee is ");
            firstName = sc.nextLine();
            System.out.println("Last name of " + (i + 1) + " employee is ");
            lastName = sc.nextLine();
            System.out.println("Salary of " + (i + 1) + " employee is ");
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.println("You entered string, please enter integer value > 0");
            }
            salary = sc.nextDouble();
            employees.add(new Employee(firstName, lastName, salary));
            sc.nextLine();
        }
        menu.menu();
    }
    public static void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add new employee data. \n" +
                "First name: ");
        firstName = sc.nextLine();
        System.out.println("Last name: ");
        lastName = sc.nextLine();
        System.out.println("Salary: ");
        salary = sc.nextDouble();
        employees.add(new Employee(firstName, lastName, salary));
    }
    public static void getAllData() {
        for (Employee employee : employees) {
            System.out.println("Salary for " + employee.getFirstName() + " " + employee.getLastName() + " is: " + employee.getSalary());
        }
    }
    public static void sumOfAllSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Sum of all salaries is: " + sum);
    }
}