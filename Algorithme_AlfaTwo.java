import java.util.*;

public class Algorithme_AlfaTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Donner un nombre entier n>0");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Donner un nombre entier n positif");
                continue;
            }
            System.out.println("Le carre de " + n + " est " + n * n);
        } while (n < 0);
        sc.close();
    }
}
