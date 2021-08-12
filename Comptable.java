public class Comptable implements Employe {
    private int id;
    private String name;
    private double salary;

    public Comptable(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employe employee) {
        employee.add(employee);
    }

    @Override
    public Employe getChild(int i) {

        return null;
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
        System.out.println("=========================");
        System.out.println("Id =" + getId());
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("=========================");
    }

    @Override
    public void remove(Employe employee) {
        employee.remove(employee);
    }
}
