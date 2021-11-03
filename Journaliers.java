public class Journaliers extends Employee3 {
    private int nbh;
    private double th;
    
    public Journaliers(String nom, String prenom, int nbh, double th) {
        super(nom, prenom);
        this.nbh = nbh;
        this.th = th;
    }
    
    public int getNbh() {
        return nbh;
    }

    public void setNbh(int nbh) {
        this.nbh = nbh;
    }

    public double getTh() {
        return th;
    }

    public void setTh(double th) {
        this.th = th;
    }

    @Override
    public String obtenirNom() {
        return "Journalier";
    }

    @Override
    public double salaire() {

        return nbh*th;
    }
    
}
