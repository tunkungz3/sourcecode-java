import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}

public class DemoCompare {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "CAT", 50));
        employees.add(new Employee(2, "ANT", 100));
        employees.add(new Employee(3, "BIRD", 150));
 
        // Sort by salary descending
        Comparator<Employee> bySalaryDescending = new SortBySalary();
        Comparator<Employee> byIdDescending = (o1, o2) -> o2.getId() - o1.getId();
        Comparator<Employee> byNameAscending = (o1,o2) -> o1.getName().compareTo(o2.getName());
        
        System.out.println("Salary sort by descending");
        Collections.sort(employees,bySalaryDescending);
        employees.forEach(System.out::println);
        System.out.println();
       
        System.out.println("Id sort by descending");
        Collections.sort(employees,byIdDescending);
        employees.forEach(System.out::println);
        System.out.println();
        
        System.out.println("Name sort by Ascending");
        Collections.sort(employees,byNameAscending);
        employees.forEach(System.out::println);
    }

}
