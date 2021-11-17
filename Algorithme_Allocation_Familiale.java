import java.util.*;

public class Algorithme_Allocation_Familiale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int montant;
        System.out.println("Entrer le nombre d'enfant ");
        int nombre_enfant = sc.nextInt();
        if (nombre_enfant <= 3) {
            montant = nombre_enfant * 150;
        } else if (nombre_enfant <= 6) {
            montant = 450 + (nombre_enfant - 3) * 38;
        } else {
            montant = 654;
        }
        System.out.println("Le montant d'allocation familiale est:" + montant);
        sc.close();

        // appelle de la fonction qui permet de calculer la somme de deux nbres
        System.out.println(somme_de_deux_nombre(12, 12));
        int res=perimetre_rectangle(12, 8);
        System.out.println(res);
    }

    public static int somme_de_deux_nombre(int nombre1, int nombre2) {
        int resulat;
        resulat = nombre1 + nombre2;
        return resulat;
    }

    public static int perimetre_rectangle(int longueur, int largeur) {
        return (2 * (longueur + largeur));
    }
}
