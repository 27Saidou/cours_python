
public class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void infos(){
        System.out.println("id " + id + " et name" +name);
    }
    public static void main(String[] args) {
        Employee ob1=new Employee("massoud",12);
        Employee ob2=new Employee("Alpha",22);
        ob1.infos();
        ob2.infos();
    }
}
