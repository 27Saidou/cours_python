public class StudentClass {
    int rollNum;
    String studentName;
    Addresse studentAddr;

    StudentClass(int roll, String name, Addresse addr) {
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddr = addr;
    }
    public static void main(String[] args) {
        Addresse ad=new Addresse(23, "Alpha", "java", "Sinthian");
        StudentClass obj = new StudentClass(123, "Nafiou", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}
