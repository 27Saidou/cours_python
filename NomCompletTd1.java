import java.util.*;

public class NomCompletTd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez votre nom svp");
        String firstname = sc.nextLine();
        System.out.println("Donner votre prenom");
        String lastname = sc.nextLine();
        String nom_Comp = firstname + lastname;
        System.out.println("Votre nom complet est \n" + nom_Comp);
        sc.close();

    }
}