public class Etudiant2 extends Personne1 {
    private int matricule;
    private String classe;
    private String filiere;
    
    public Etudiant2(String name, String username, String address, int matricule, String classe, String filiere) {
        super(name, username, address);
        this.matricule = matricule;
        this.classe = classe;
        this.filiere = filiere;
    }

    public void afficher_info_etudiant(){
        System.out.println("Le matricule de l'etudiant est "+matricule);
        System.out.println("La classe de l'etudiant est " + classe);
        System.out.println("La filiere de l'etudiant est " + filiere);
        super.affiche();
    }
}
