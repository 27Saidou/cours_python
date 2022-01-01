import java.util.*;

public class Algorithme_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.println("Voulez-vous terminer et quitter");
            c = sc.nextLine().charAt(0);
        } while (c != 'o' && c != 'n');
        if (c != 'o') {
            System.out.println("La tache se termine tout de suite\n");
        } else {
            System.out.println("Ok on continue\n");
            sc.close();
        }
    }
}
