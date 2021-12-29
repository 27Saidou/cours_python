import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo0012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entrez employee Id: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Entrez votre nom : ");
        String ename = br.readLine();
        System.out.print("\n");

        System.out.print("Entrez Employee Designation: ");
        String edesignation = br.readLine();
        System.out.print("\n");

        System.out.print("Entrez Employee Address: ");
        String eaddress = br.readLine();
        System.out.print("\n");

        System.out.print("Entrez Employee Salary: ");
        double esalary = Double.parseDouble(br.readLine());
        System.out.print("\n");
        EmployeeRecords001 e1 = new EmployeeRecords001(eid, ename, edesignation, esalary, eaddress);
        e1.showRecord();
        System.out.println("\n");
        EmployeeRecords001 e2 = (EmployeeRecords001) e1.getClone();
        e2.showRecord();

    }
}
