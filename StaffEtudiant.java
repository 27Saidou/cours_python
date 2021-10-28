public class StaffEtudiant {
    int rollno;
    String name;
    String course;
    float fee;
    StaffEtudiant(int rollno, String name, String course, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }
    public void information_etudiant(){
        System.out.println(rollno + " "+ name+" "+course+" " + fee);
    }
public static void main(String[] args) {
    StaffEtudiant etudiant = new StaffEtudiant(112,"Alpha","java",6000f);
    etudiant.information_etudiant();
    
}
    
}
