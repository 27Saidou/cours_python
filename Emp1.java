public class Emp1 {
    int id;
    String name;
    // relation HAS-A en java Exemple
    Address address;

    public Emp1(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void afficher_information_employee_and_andress() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
    
    

    public static void main(String[] args) {
        Address address1 = new Address("koure", "Tima", "Noussy");
        Address address2 = new Address("Banga", "Kebaly", "Dalaba");
        Emp1 emp1 = new Emp1(101, "alfa", address1);
        Emp1 emp2 = new Emp1(111, "Massoud", address2);
        emp1.afficher_information_employee_and_andress();
        emp2.afficher_information_employee_and_andress();
        System.out.println("La sommes de "+add(11,11));
        System.out.println("La sommes de "+add1(11,11,11));
    }
    
    static int add(int a, int b) {
        return a + b;
    }

    public static double add1(int a, int b,int c) {
        return a + b+c;
    }
}
