public class CollegeEtude {
    String collegeName;
    // relation HAS-A en java
    Adresse collegeAddr;

    public CollegeEtude(String collegeName, Adresse addr) {
        this.collegeName = collegeName;
        this.collegeAddr = addr;
    }
    public static void main(String[] args) {
        Adresse ad=new Adresse(55, "Alfa", "Up", "Sinthian");
        CollegeEtude etudiant=new CollegeEtude("Bantignel",ad);
        System.out.println(etudiant.collegeName);
        System.out.println(etudiant.collegeAddr);
        System.out.println(etudiant.collegeAddr.streetNum);
        System.out.println(etudiant.collegeAddr.city);
        System.out.println(etudiant.collegeAddr.state);
        System.out.println(etudiant.collegeAddr.country);
    }
}
