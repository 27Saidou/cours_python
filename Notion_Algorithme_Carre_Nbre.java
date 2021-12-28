import java.util.*;

public class Notion_Algorithme_Carre_Nbre {
    public static int carre(int x) {
        int calcul;
        calcul = x * x;
        return calcul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier valide nb");
        int nb = sc.nextInt();
        int result = carre(nb);
        System.out.println("Le carre de ce nombre est " + result);
        sc.close();
    }
}