public class Commissionnaire extends Employee3 {
    private int fixe;
    private int nbart;
    private double taux;

    public Commissionnaire(String nom, String prenom, int fixe, int nbart, double taux) {
        super(nom, prenom);
        this.fixe = fixe;
        this.nbart = nbart;
        this.taux = taux;
    }

    public int getFixe() {
        return fixe;
    }

    public void setFixe(int fixe) {
        this.fixe = fixe;
    }

    public int getNbart() {
        return nbart;
    }

    public void setNbart(int nbart) {
        this.nbart = nbart;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String obtenirNom() {
        return "Travailleur Commissionnaire";
    }

    @Override
    public double salaire() {
        return fixe + fixe * nbart;
    }

}
