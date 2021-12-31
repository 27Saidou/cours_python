import java.util.*;

public class FonctionAlfa {
    public static int somme(int x, int y) {
        int res = x + y;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier nombre");
        int first_number = sc.nextInt();
        System.out.println("Entrez le second nombre");
        int second_number = sc.nextInt();
        float resultat = somme(first_number, second_number);
        System.out.println("La somme de " + first_number + " " + second_number + " est " + resultat);
        sc.close();
    }
}
