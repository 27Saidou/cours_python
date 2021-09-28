/**
 * cette program java permet de demontrer l'encapsulation
 */
public class Etudiant_Alpha {
    // variable instance of etudiant
    private String nom;
    private String prenom;
    private int age;
    private String profession;
    private double taille;
    private String couleur_cheveux;
    
    // constructeur de la class etudiant
    public Etudiant_Alpha() {
    }
    // getter and setter
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public double getTaille() {
        return taille;
    }
    public void setTaille(double taille) {
        this.taille = taille;
    }
    public String getCouleur_cheveux() {
        return couleur_cheveux;
    }
    public void setCouleur_cheveux(String couleur_cheveux) {
        this.couleur_cheveux = couleur_cheveux;
    }
    
}
