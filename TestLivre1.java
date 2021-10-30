import java.util.*;

public class TestLivre1 {
    public static boolean premier(int n) {
        int i = 2;
        boolean test;
        while (i <= (n / 2) && (n % i != 0)) {
            i++;
        }
        if (i > (n / 2) && (n > 1)) {
            return true;
            
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // afficher un message pour dire de saisir un nombre entier positif
        System.out.println("Entrer un nombre entier positif svp");
        int n = sc.nextInt();
        if (premier(n) == true) {
            System.out.println(n + " est un nombre premier");
        } else {
            System.out.println(n + " n'est pas un nombre premier");
            sc.close();
        }
    }
}
