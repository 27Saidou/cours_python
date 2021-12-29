import java.util.Scanner;

public class NotionJava_Algorithmie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char rep;
        System.out.println("Entrez une chaine: Voulez-vous du cafe(oui/non)");
        rep = sc.nextLine().charAt(0);
        while (rep == 'o' || rep == 'n') {
            System.out.println("Vous devez repondre par o ou n,Sinon Recommencez");
            rep = sc.nextLine().charAt(0);
        }
        System.out.println("Saisie acceptee");
        sc.close();
    }
}