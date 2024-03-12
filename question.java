import java.util.ArrayList;
import java.util.List;
class Employee<T> {
    private T name;
    private int salary;
    private String status;
    public Employee(T name, int salary) {
        this.name = name;
        this.salary = salary;
        this.status = "Intern";
    }
    // Copy constructor
    public Employee(Employee<T> other) {
        this.name = other.name;
        this.salary = other.salary;
        this.status = other.status;
    }
    public void becomePermanent() {
        this.status = "Permanent";
        this.salary *= 2;
    }
    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", status=" + status + "]";
    }
}
class Company {
    List<Employee<?>> employees;
    public Company() {
        this.employees = new ArrayList<Employee<?>>();
    }
    public void addEmployee(Employee<?> employee) {
        this.employees.add(employee);
    }
    public void displayEmployees() {
        for (Employee<?> employee : employees) {
            System.out.println(employee);
        }
    }
}
public class question {
    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee(new Employee<>("John Doe", 30000));
        company.addEmployee(new Employee<>("Jane Doe", 35000));

        System.out.println("Initial list of employees:");
        company.displayEmployees();

        Employee<String> firstEmployee = (Employee<String>) company.employees.get(0);
        firstEmployee.becomePermanent();

        System.out.println("\nUpdated list of employees:");
        company.displayEmployees();
    }
}
