public class StaffEmployee {
    int id;
    String name;
    float salary;
    void insert(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void afficher_information_staff(){
        System.out.println(id+" "+ name+" "+salary);
    }
    public void trouver_un_nombre_impaire(int num){
        if (num%2==0) {
            System.out.println("le nombre est paire");
        } else {
            System.out.println("le nombre est impaire");
        }
    }
    public static void main(String[] args) {
        StaffEmployee e1 = new StaffEmployee();
        e1.insert(101, "Alfa Diallo", 12000f);
        e1.afficher_information_staff();
        e1.trouver_un_nombre_impaire(12);
    }
}
