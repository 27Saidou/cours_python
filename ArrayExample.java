
public class ArrayExample {
    public static void main(String[] args) {
        Employer[]employeeName=new Employer[5];
        employeeName[0] = new Employer(1, "Alpha");
        employeeName[1] = new Employer(2, "Nafiou");
        employeeName[2] = new Employer(3, "Saidou");
        employeeName[3] = new Employer(4, "Docteur");
        employeeName[4] = new Employer(5, "Massoud");
        for (Employer employer : employeeName) {
            System.out.println("Id="+employer.getEmpId()+" name-"+employer.getEmpName());
        }
    }
}
