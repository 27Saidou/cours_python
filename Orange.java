public class Orange extends Fruit {
    int poids;

    public Orange(int p) {
        poids=p;
        System.out.println("Creation d'une Orange de "+poids+"grammes");
    }
    @Override
    public void affiche() {
        System.out.println("creation d'une Orange ");
    }

    public void afficherPoids() {
        System.out.println("le poids de l'orange est:" + poids);
    }
}
