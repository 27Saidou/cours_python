public class Rectangle extends Forme {

    double longueur;
    double largeur;

    public Rectangle(String coleur, double longueur, double largeur) {
        // appel du constructeur de la classe Forme
        super(coleur);
        System.out.println("Constructeur de la classe Rectangle est appele");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double surface() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "La couleur de la rectangle est " + super.coleur + " et la surface est : " + surface();
    }

}
