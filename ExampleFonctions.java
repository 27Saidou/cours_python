import java.util.*;

public class ExampleFonctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la premier valeur de x");
        int x = sc.nextInt();
        System.out.println("Entrer la second valeur de Y:");
        int y = sc.nextInt();
        int res = sommes(x, y);
        System.out.println("La sommes de deux nombres est :" + res);
        sc.close();
    }

    public static int sommes(int nombre1, int nombre2) {
        int localResulat = nombre1 + nombre2;
        return localResulat;
    }
}
