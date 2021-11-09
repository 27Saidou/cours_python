import java.util.*;

public class ApplicationStagiaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n, p;
        float mg;
        System.out.println("Entrer votre nom :");
        n = sc.nextLine();
        System.out.println("Entrer votre prenom :");
        p = sc.nextLine();
        System.out.println("Entrer votre moyenne generale :");
        mg = sc.nextFloat();
        Stagiaire stag = new Stagiaire();
        stag.setNom(n);
        stag.setPrenom(p);
        stag.setMg(mg);
        System.out.println("Votre nom est : " + stag.getNom());
        System.out.println("Votre prenom est : " + stag.getPrenom());
        System.out.println("Votre moyenne generale est de :" + stag.getMg());
        stag.resulat();
        sc.close();
    }
}
