import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager00224 implements Employee00224 {
    private int id;
    private String name;
    private double salary;

    public BankManager00224(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    List<Employee00224> employees = new ArrayList<Employee00224>();

    @Override
    public void add(Employee00224 employee) {
        employees.add(employee);
    }

    @Override
    public Employee00224 getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void remove(Employee00224 employee) {
        employees.remove(employee);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("==========================");
        System.out.println("Id =" + getId());
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("==========================");

        Iterator<Employee00224> it = employees.iterator();

        while (it.hasNext()) {
            Employee00224 employee = it.next();
            employee.print();
        }
    }

}
