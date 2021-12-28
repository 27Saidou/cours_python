import java.util.*;

public class FonctionAlgorithme {
    public static float exposant(float nb, int puiss) {
        float res;
        res = 1.0f;
        for (int i = 1; i <= puiss; i++) {
            res = res * nb;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float result, x;
        int n;
        System.out.println("Entrez un nombre");
        x = sc.nextInt();
        System.out.println("Entrez un exposant");
        n = sc.nextInt();
        result = exposant(x, n);
        System.out.println(result);
        sc.close();
    }
}
