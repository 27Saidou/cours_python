public class MathTeacher extends Teacher {
    String mainSubject ="Technology";
    public static void main(String[] args) {
        MathTeacher obj=new MathTeacher();
        System.out.println(obj.college);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
    
}
