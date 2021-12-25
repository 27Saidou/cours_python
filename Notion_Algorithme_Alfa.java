import java.util.*;

public class Notion_Algorithme_Alfa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char reponse = 'O';
        while (reponse == 'O') {
            System.out.println("Quel est votre prenom ?");
            String prenom = sc.nextLine();
            System.out.println("Bonjour " + prenom + ", quel est ton nom ?");
            String nom = sc.nextLine();
            System.out.println("Bonjour " + prenom + nom + ", quel age as-tu ?");
            int age = sc.nextInt();
            System.out.println("Bienvenue a toi " + prenom + nom + ", tu as : " + age + " ans !");
            System.out.print("Veux-tu recommencer ce test ?");
            sc.nextLine();
            reponse = sc.nextLine().charAt(0);
        }
        System.out.println("Au revoir !");
        sc.close();
    }
}
