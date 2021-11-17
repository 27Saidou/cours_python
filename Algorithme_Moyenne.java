import java.util.*;

public class Algorithme_Moyenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une note valide svp:");
        int moy = sc.nextInt();
        if (moy >= 10) {
            System.out.println("Bravo vous avez reussi !");
        } else {
            if (moy >= 8) {
                System.out.println("Vous devez effectuez un examen de rattrapage");
            } else {
                System.out.println("Desole vous avez echouez !!!");
                sc.close();
            }
        }
    }
}
