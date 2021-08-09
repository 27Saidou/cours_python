public class EtudiantBailoBaya {
    int rollNum;
    String studentName;
    // creation de la relation HAS-A en java avec la class Address1
    Address1 studentAddr;

    EtudiantBailoBaya(int roll, String name, Address1 addr) {
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddr = addr;
    }

    public static void main(String[] args) {
        Address1 ad1 = new Address1(21, "Alpha", "Bailobaya", "Conakry");
        EtudiantBailoBaya ed = new EtudiantBailoBaya(123, "Nafiou Barry", ad1);
        System.out.println(ed.rollNum);
        System.out.println(ed. studentName);
        System.out.println(ed.studentAddr.streetNum);
        System.out.println(ed.studentAddr.city);
        System.out.println(ed.studentAddr.state);
        System.out.println(ed.studentAddr.country);
    }
}
