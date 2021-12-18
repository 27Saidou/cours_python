import java.util.*;

public class Exemple_Fonction_Et_Procedure 
{
    // exemple procedure en algorithmie
    public static void somme_Nombre(int a, int b) {
        int res;
        res = a + b;
        System.out.println("La somme est de :" + res);
    }
    // exemple fonction en algorithmie
    public static float somme_Nombre001(float x, float y) {
        float res;
        res = x + y;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la premier valeur A");
        int a = sc.nextInt();
        System.out.println("Entrez le second valeur de B");
        int b = sc.nextInt();
        float result = somme_Nombre001(a, b);
        System.out.println("La somme de " + a + " et " + b + " est =" + result);
        somme_Nombre(18, 350);
        sc.close();
    }
}
