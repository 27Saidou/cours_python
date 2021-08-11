import java.util.Scanner;
public class CompteBancaireDemo {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        CompteBancaire cb=new CompteBancaire(1,1000000);
        System.out.println("Afficher");
        cb.retirer(500000);
        System.out.println("mettre a jour apres");
        cb.display();
        System.out.println("verifier le rib");
        System.out.println(cb.checkRib(2));
        clavier.close();
    }
}
