import java.util.*;

public class Carre_Nbre_Algorithmie {
    public static float carre(float x) {
        float calcul;
        calcul = x * x;
        return calcul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre valide");
        float nb = sc.nextFloat();
        float result = carre(nb);
        System.out.println("Sont carre est =" + result);
        sc.close();
    }
}
