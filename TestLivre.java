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
        int n;
        System.out.println("Entrer un nombre entier positif");
        n = sc.nextInt();
        if (premier(n) == true) {
            System.out.println(n + " est un nombre entier positif");
        } else {
            System.out.println(n + " n'est pas un nombre entier positif");
            sc.close();
        }
    }
}
