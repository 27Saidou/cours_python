import java.util.*;
public class Profession_Algorithmique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prenom[];
        prenom = new String[1];
        for (int i = 0; i<1; i++) {
            System.out.println("Entrez votre prenom: "+i+1);
            prenom[i] =sc.nextLine();
            System.out.println("Votre prenom est "+prenom[i]+" ");

        }
        
        sc.close();
    }
}
