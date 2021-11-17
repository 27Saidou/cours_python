import java.util.*;

public class Algorithme_Signe_Produit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de n:");
        int n = sc.nextInt();
        System.out.println("Entrer la valeur de m");
        int m = sc.nextInt();
        if (m == 0 || n == 0) {
            System.out.println("Le produit est null");
        } else if (m < 0 && n < 0 || m > 0 && n > 0) {
            System.out.println("Le produit est positif");
        } else {
            System.out.println("Le produit est negatif");
            sc.close();
        }
    }
}
