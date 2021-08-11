public class CompteBancaire {
    int rib;
    double solde;

    CompteBancaire(int rib, double solde) {
        this.rib = rib;
        this.solde = solde;
    };

    public void setBancaire(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public boolean checkRib(int valRib) {
        return rib == valRib;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        }
    }
    public void display(){
        System.out.println("Rib:"+rib);
        System.out.println("Solde:"+solde);
    }
}
