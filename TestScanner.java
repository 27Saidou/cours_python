import java.util.*;
import java.io.IOException;
import java.util.InputMismatchException;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une chaine de caractere");
        String chaine = sc.nextLine();
        Integer nombre = null;
        do {
            try {
                System.out.println("Saisissez un nombre :");
                nombre = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.err.println("Ceci n'est pas un nombre valide ");
            }
        } while (nombre != null);
        String identifiant = null;
        do {
            System.out.println("Saisissez les 8 caractere de votre Identifiant:");
            if (sc.hasNext(".{8}")) {
                identifiant = sc.next();

            } else {
                sc.next();
                System.err.println("Ceci n'est pas un nombre identifiant valide ");
            }

        } while (identifiant == null);
        System.out.println("Vous avez saisie ");
        System.out.println(chaine);
        System.out.println(nombre);
        System.out.println(identifiant);
        sc.close();
    }
}
