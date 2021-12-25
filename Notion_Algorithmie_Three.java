import java.util.*;

public class Notion_Algorithmie_Three {
    public static void main(String[] args) {
        char rep;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Aimez-vous l'algorithmie(Oui ou non)");
            rep = sc.nextLine().charAt(0);
        } while (rep == 'o' || rep == 'n');
        sc.close();
    }
}
