public class EtudiantClass {
    int rollNum;
    String studentName;
    // Creation HAS-A relationship avec Adress class
    // L'association établit une relation entre deux classes distinctes à travers
    // leurs objets .
    Adress studentAddr;
    public EtudiantClass(int rollNum, String studentName, Adress studentAddr) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.studentAddr = studentAddr;
    }
    public static void main(String[] args) {
        Adress ad = new Adress(55, "Saidou", "UP", "Sinthian");
        EtudiantClass etudiant=new EtudiantClass(123,"Alpha Diallo", ad);
        System.out.println(etudiant.rollNum);
        System.out.println(etudiant.studentName);
        System.out.println(etudiant.studentAddr.streetNum);
        System.out.println(etudiant.studentAddr.city);
        System.out.println(etudiant.studentAddr.state);
        System.out.println(etudiant.studentAddr.country);
    }
}
