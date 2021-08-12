import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employe {
    private int id;
    private String name;
    private double salary;

    public BankManager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    List<Employe> employees = new ArrayList<Employe>();

    @Override
    public void add(Employe employee) {
        employees.add(employee);
    }

    @Override
    public Employe getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void remove(Employe employee) {
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

        Iterator<Employe> it = employees.iterator();

        while (it.hasNext()) {
            Employe employee = it.next();
            employee.print();
        }
    }
}
