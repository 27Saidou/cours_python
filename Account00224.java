public class Account00224 implements Employee00224 {
    private int id;
    private String name;
    private double salary;

    public Account00224(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee00224 employee) {
    }

    @Override
    public Employee00224 getChild(int i) {

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
        System.out.println("==========================");
        System.out.println("Id =" + getId());
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("==========================");
    }

    @Override
    public void remove(Employee00224 employee) {

    }

}
