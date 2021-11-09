public class Stagiaire {
    private String nom;
    private String prenom;
    private float mg;

    public Stagiaire() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getMg() {
        return mg;
    }

    public void setMg(float mg) {
        this.mg = mg;
    }

    public void resulat() {
        if (this.mg >= 10) {
            System.out.println("Bravo vous etes admis");
        } else {
            System.out.println("Desole vous avez echouez");
        }
    }
}