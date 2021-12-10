import java.util.*;

public class Valeur_Absolue {
    public static int abs(int un_Entier) {
        int valeur_absolue;
        if (un_Entier >= 0) {
            valeur_absolue = un_Entier;
        } else {
            valeur_absolue = -un_Entier;
        }
        return valeur_absolue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une valeur entiere !");
        int a = sc.nextInt();
        int res = abs(a);
        System.out.println("La valeur absolue de " + a + " est :" + res);
        sc.close();
    }
}
