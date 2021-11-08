import java.util.*;

public class ApplicationIsARelation {
    public static void main(String[] args) {
        StaffCustomer c1 = new StaffCustomer("Alfa", "Guinee");
        StaffCustomer c2 = new StaffCustomer("Saidou", "Dakar");
        StaffCustomer c3 = new StaffCustomer("Massoud", "Afghan");
        StaffCustomer c4 = new StaffCustomer("Nafiou", "Conakry");
        List<StaffCustomer> Customers = new ArrayList<StaffCustomer>();
        Customers.add(c1);
        Customers.add(c2);
        Customers.add(c3);
        Customers.add(c4);

        StaffBank ABCBank = new StaffBank(Customers);

        List<StaffCustomer> cust = ABCBank.TotalAccountsInBank();

        for (StaffCustomer cst : cust) {

            System.out.println("Name of the Customer : " + cst.name + "\n" + "City : " + cst.city);

        }
    }
}
