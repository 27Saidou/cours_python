class Student_Niit {
private int rollno;
private String name;
public int getRollno() {
    return rollno;
}
public void setRollno(int rollno) {
    this.rollno = rollno;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

}
public class Encapsulation_Demo {
    public static void main(String[] args) {
        Student_Niit s1 = new Student_Niit();
        s1.setRollno(2);
        s1.setName("massoud");
        System.out.println("le rollNo est de :"+s1.getRollno()+" votre nom est de "+s1.getName());
        
    }
}
