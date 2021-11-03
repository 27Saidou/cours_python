public class StaffPersonne {
    private String nom;
    private String prenom;
    private int age;

    public StaffPersonne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void affiche() {
        System.out.println("Le nom de la personne est " + nom);
        System.out.println("Le prenom de la personne est " + prenom);
        System.out.println("L\' age de la personne est " + age);
    }
}
