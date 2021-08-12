public class CompositePatterndemo {
    public static void main(String[] args) {
        Employe emp1 = new Cashier(101, "Alpha diallo", 20000.0);
        Employe emp2 = new Cashier(102, "Nafiou Barry", 25000.0);
        Employe emp3 = new Comptable(103, "Saidou diallo", 30000.0);
        Employe manager1 = new BankManager(100, "Ramatoulaye bah", 100000.0);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();
    }
}
