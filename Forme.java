public abstract class Forme {
    // attribut couleur
    String coleur;

    // Méthodes abstraites
    abstract double surface();

    public abstract String toString();

    // Classe abstraite peut avoir un constructeur
    public Forme(String coleur) {
        System.out.println("Constructeur de la classe Forme est appele");
        this.coleur = coleur;
    }

    // Méthode concrète
    public String getColeur() {
        return coleur;
    }
}
