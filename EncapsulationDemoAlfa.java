public class EncapsulationDemoAlfa {
    public static void main(String[] args) {
        // creation instance of encapsulation
        EmployeeDepartment e=new EmployeeDepartment();
        e.setName("Alfa");
        System.out.println(e.getName());
        e.setDepartment("Business Analysis");
        System.out.println(e.getDepartment());
    }
}
