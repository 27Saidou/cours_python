import java.util.*;
public class Algorithmie_TD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valeurMax,nbRef;
        System.out.println("Donner la valeur de Reference");
        nbRef=sc.nextInt();
        System.out.println("Donner la valeur maximal");
        valeurMax=sc.nextInt();
        while (valeurMax>=nbRef) {
            if (valeurMax%nbRef==0) {
                System.out.println("la valeur max est :"+valeurMax);
                valeurMax--;
            }
            System.out.println("C'est fini!\n");
            sc.close();
        }
    }
}
