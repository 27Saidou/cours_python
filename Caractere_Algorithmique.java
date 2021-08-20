import java.util.*;

public class Caractere_Algorithmique {
    public static void main(String[] args) {
        try {
            Scanner clavier = new Scanner(System.in);

            System.out.println("Entrez la caractere de a");
            char a = clavier.next().charAt(1);
            System.out.println("You have entered: " + a);
            System.out.println("Entrez le caractere de b");
            char b = clavier.next().charAt(2);
            System.out.println("You have entered: " + b);
            System.out.println("Entrez le caractere de c");
            char c = clavier.next().charAt(100);
            System.out.println("You have entered: " + c);
            if (a < b && b < c) {
                System.out.println("Ces noms sont classés alphabétiquement");
            } else {
                System.out.println("Ces noms ne sont pas classés");
                clavier.close();
            }
        } catch (Exception e) {
            System.out.println("impossible de recuperer tous les caracteres" + e.getMessage());
        }
    }
}
