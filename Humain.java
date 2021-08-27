public class Humain {
    int empId;
    String empName;

    // parameterized constructor with two parameters
    Humain(int id, String name){  
        this.empId = id;  
        this.empName = name;  
    }

    void info() {
        System.out.println("Id: " + empId + " Name: " + empName);
    }
    public static void main(String[] args) {
        Humain employee=new Humain(1001,"Alpha");
        employee.info();
    }
}
