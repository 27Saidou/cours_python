import java.util.*;

public class Table_De_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un chiffre s'il vous plait Mr.");
        int nbre = sc.nextInt();
        System.out.println("\n Table de multiplication de " + nbre);
        for (int i = 1; i <= 10; ++i) {
            System.out.println(nbre + " * " + i + " = " + nbre * i);

        }
        sc.close();
    }
}
