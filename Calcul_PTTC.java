import java.util.*;

public class Calcul_PTTC {
    public static final float TVA = 0.2f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le prix total hors taxe :");
        double PTHT = sc.nextDouble();
        if (PTHT > 1500) {
            PTHT = PTHT * 0.98;
        }
        double PTTC = PTHT + (PTHT * TVA);
        System.out.println("Le prix TTC est :" + PTTC);
        sc.close();
    }
}
