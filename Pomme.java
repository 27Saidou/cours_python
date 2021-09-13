public class Pomme extends Fruit {
    int poids;
    public Pomme(int p){
        poids=p;
        System.out.println("Creation d'une pomme de " +poids + " grammes");
    }
    @Override
    public void affiche(){
        System.out.println("creation d'une pomme ");
    }
    public void afficherPoids(){
        System.out.println("le poids de la pomme est: " +poids);
    }
}
