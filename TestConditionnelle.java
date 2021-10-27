import java.util.*;

public class TestConditionnelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lettre;
        System.out.println("Entrez une lettre svp!");
        String str = sc.nextLine();
        lettre = str.charAt(0);
        if (lettre == 'a' || lettre == 'A') {
            System.out.println("Premiere lettre de l'alphabet");
        } else if (lettre == 'z' || lettre == 'Z') {
            System.out.println("Derniere lettre de l'alphabet'");
        } else {
            System.out.println("Ni la premiere,Ni la derniere lettre de l'alphabet");
        }
        sc.close();
    }
}
