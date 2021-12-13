import java.util.*;

public class Exemple_Fonction_Algorithmique {
    public static int two_value(int x, int y) {
        int min;
        if (x >= y) {
            min = x;
        } else {
            min = y;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre la valeur de a");
        int a = sc.nextInt();
        System.out.println("Entrez la valeur de b");
        int b = sc.nextInt();
        int res = two_value(a, b);
        System.out.println("Le minimum de " + a + " et " + b + " est =" + res);
        sc.close();

    }
}