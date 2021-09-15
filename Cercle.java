public class Cercle extends Forme {
    double rayon;
    
    public Cercle(String coleur, double rayon) {
        // appel du constructeur de la classe Forme
        super(coleur);
        System.out.println("Constructeur de la classe Cercle est appele");
        this.rayon = rayon;
    }

    @Override
    double surface() {
    
     return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return "La couleur de la cercle est " + super.coleur + " et la surface est : " + surface();

    }
    
}
