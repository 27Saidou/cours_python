public class Staff {
    String employeeName;
    // Creating HAS-A relationship with Address class
    Address1 employeeAddr;

    Staff(String name, Address1 addr) {
        this.employeeName = name;
        this.employeeAddr = addr;
    }
    // mettre ici la methode main pour creer les objets Staff
}
