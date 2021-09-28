public class EncapsulationTest {
    public static void main(String[] args) {
        Etudiant_Alpha e1=new Etudiant_Alpha();
        // setting les valeur of the variable
        e1.setNom("Diallo");
        e1.setPrenom("Alfa");
        e1.setAge(27);
        e1.setProfession("developpeur web&mobile");
        e1.setCouleur_cheveux("noir");
        e1.setTaille(1.79);
        // Afficher la valeur des objects ou variable
        System.out.println("Nom est:"+e1.getNom());
        System.out.println("Son Prenom est:" + e1.getPrenom());
        System.out.println("Son Age est=" + e1.getAge());
        System.out.println("il est :" + e1.getProfession());
        System.out.println("ses Cheveux sont de couleur :"+e1.getCouleur_cheveux());
        System.out.println("il a une taille de :"+e1.getTaille());

    }
}
