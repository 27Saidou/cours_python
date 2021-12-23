public class Personne001 {
    private String prenom;
    private String nom;
    private int age;
    private String address;
    static int nbrePersonne = 0;

    public Personne001(String prenom, String nom, int age, String address) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.address = address;
        Personne001.nbrePersonne++;
    }

    public int update(int valplus) {
        this.age += valplus;
        return this.age;
    }

    public void afficherAttributs() {
        System.out.println("les attributs " + this.prenom + "  "  +  this.nom +  "   "  + this.age +   "   "  + this.address);
    }

    public static void main(String[] args) {
        System.out.println("test POO");
        Personne001 p1 = new Personne001("TDSI", "NIIT", 18, "MERMOZ");
        p1.afficherAttributs();
        System.out.println("Creation d'un autre objet");
        Personne001 p2 = new Personne001("ESMT", "NIIT", 18, "FANN");
        p2.afficherAttributs();
        System.out.println("NbrePersonne Initialiser" + Personne001.nbrePersonne);
        System.out.println("Augmente l'age de la personne P2");
        p2.update(3);
        System.out.println("P2 Apres update");
        p2.afficherAttributs();

    }
}
