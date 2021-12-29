public class EmployeeRecords001 implements Prototype001 {
    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecords001() {
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");
    }

    public EmployeeRecords001(int id, String name, String designation, double salary, String address) {
        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord() {

        System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
    }

    @Override
    public Prototype001 getClone() {
        return new EmployeeRecords001(id, name, designation, salary, address);
    }

}
