import java.util.*;

public class Exemple_Procedure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la valeur de A");
        float a = sc.nextFloat();
        System.out.println("Entrez la valeur de B");
        float b = sc.nextFloat();
        float sum = a + b;
        float prod = a * b;
        if (sum >= 0) {
            System.out.println(sum + "Le Somme est positif");
        } else {
            System.out.println(sum + "La Somme est negatif");
        }
        if (prod >= 0) {
            System.out.println(prod + "Le produit est positif");
        } else {
            System.out.println(prod + "Le produit est negatif");
        }
        sc.close();
    }
}
