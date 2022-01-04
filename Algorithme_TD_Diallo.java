import java.util.Scanner;

public class Algorithme_TD_Diallo {
    static String Nom, Prenom;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre nom");
        Nom = sc.nextLine();
        System.out.println("Entrez votre prenom");
        Prenom = sc.nextLine();
        System.out.println("Entrez votre age ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Vous etes  mineur");
        } else {
            System.out.println("Vous etes majeur");
            sc.close();
        }
    }
}
