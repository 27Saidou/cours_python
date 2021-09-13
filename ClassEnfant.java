public class ClassEnfant extends SuperParent {
    int i = 100;

    public void affiche() {
        super.affiche();
        System.out.println("methode de la classe enfant");
        System.out.println("la valeur de i est :" + i);
        System.out.println("la valeur du parent class :" + super.i);

    }
}
