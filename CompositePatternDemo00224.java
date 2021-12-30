public class CompositePatternDemo00224 {
    public static void main(String[] args) {
        Employee00224 emp1 = new Cashier00224(101, "Engineer java", 20000.0);
        Employee00224 emp2 = new Cashier00224(102, "Massoud commadant", 25000.0);
        Employee00224 emp3 = new Account00224(103, "Fatoumata Diallo", 30000.0);
        Employee00224 manager1 = new BankManager00224(100, "Alfa Diallo", 100000.0);
        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();
    }
}
