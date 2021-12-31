import java.util.*;

public class Somme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // permet d'afficher un message a l'ecran
        System.out.println("Entrez le premier nombre ");
        // recueillir la valeur du premier nombre
        float nombre1 = sc.nextFloat();
        // permet d'afficher un message a l'ecran
        System.out.println("Entrez le deuxieme nombre");
        // recueillir la valeur du premier nombre
        float nombre2 = sc.nextFloat();
        // calcul les deux nombres 
        float result = nombre1 + nombre2;
        // afficher la somme de deux nombres
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " et " + result);
        sc.close();
    }

}
