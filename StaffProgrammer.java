public class StaffProgrammer extends EmployeeNiit {
    int bonus=10000;
    public static void main(String[] args) {
        StaffProgrammer devs=new StaffProgrammer();
        System.out.println("La salaire du programmer est :"+devs.salary);
        System.out.println("Le Bonus de Programmer :"+ devs.bonus);
    }
}
