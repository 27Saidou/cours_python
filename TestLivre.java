import java.util.*;
public class TestLivre {
    public static boolean premier(int n) {
        int i, cpt = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                cpt++;
        }
        if (cpt == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // afficher un message pour dire de saisir un nombre entier positif
        System.out.println("Entrer un nombre entier positif");
        // recolter la valeur au clavier
        int n = sc.nextInt();
        if (premier(n) == true) {
            // afficher un resultat si le nombre est premier 
            System.out.println(n + " est un nombre entier positif");
        } else {
            // afficher si le nbre n'est pas un entier premier positif
            System.out.println(n + " n'est pas un nombre entier positif");
            sc.close();
        }
    }
}
