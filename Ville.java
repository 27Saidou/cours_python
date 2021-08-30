public class Ville {
    /**attribut de la Ville */
    private String nomVille;
    private String nomPays;
    private int nombreHabitant;

    /** Constructeur par défaut */
    public Ville() {
    }
    // getter and setter
    public String getNomVille() {
        return nomVille;
    }
    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }
    public String getNomPays() {
        return nomPays;
    }
    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }
    public int getNombreHabitant() {
        return nombreHabitant;
    }
    public void setNombreHabitant(int nombreHabitant) {
        this.nombreHabitant = nombreHabitant;
    }
    /** creation d'une Ville avec ses parametres */
    public Ville(String nomVille, String nomPays, int nombreHabitant) {
        this.nomVille = nomVille;
        this.nomPays = nomPays;
        this.nombreHabitant = nombreHabitant;
    }
    public static void main(String[] args) {
        Ville ville = new Ville("Bailobaya","Conakry",13000000);
        System.out.println(ville.getNomVille());
        System.out.println(ville.getNomPays());
        System.out.println(ville.getNombreHabitant());
    }
}
