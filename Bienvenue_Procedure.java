import java.util.*;

public class Bienvenue_Procedure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jj, aa, mm, ja, ma, aan;
        System.out.println("Entrez la valeur de jj");
        jj = sc.nextInt();
        System.out.println("Entrez la valeur de mm");
        mm = sc.nextInt();
        System.out.println("Entrez la valeur de aa");
        aa = sc.nextInt();
        sc.next();
        System.out.println("SVP quel est votre nom");
        String nom = sc.nextLine();
        if (nom == "Ahmed") {
            System.out.println("Bienvenue Ahmed");
            System.out.println("SVP quelle est la date de votre anniversaire");
            ja = sc.nextInt();
            System.out.println("Entrez la valeur de ma");
            ma = sc.nextInt();
            System.out.println("Entrez la valeur de aan");
            aan = sc.nextInt();
            if (ja == jj && ma == mm && aan == ma) {
                System.out.println("Joyeux Anniversaire");
            }
        } else {
            System.out.println("Erreur de personne !");
            sc.close();
        }
    }
}
