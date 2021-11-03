public abstract class Employee3 {
    private String nom;
    private String prenom;
    public Employee3(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public abstract double salaire();
    public abstract String obtenirNom();
}
