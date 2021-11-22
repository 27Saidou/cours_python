import java.util.*;

public class ExampleFonction {
    public static int calcul_deux_nbre(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de x");
        int x = sc.nextInt();
        System.out.println("Entrer la valeur de y");
        int y = sc.nextInt();
        int resultat = calcul_deux_nbre(x, y);
        System.out.println("La somme de deux valeurs est de :" + resultat);
        sc.close();

    }
}
