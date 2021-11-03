public class StafEmployee {
    private String nom;
    private String prenom;
    private int age;
    private static int cpt;

    public StafEmployee(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        cpt++;
    }

    public void afficher_information_employee() {
        System.out.println("L'employee" + nom + " " + prenom + " " + age);
    }

    public static int getNombre() {
        return cpt;
    }
}
