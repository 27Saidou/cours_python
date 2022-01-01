import java.util.*;
public class Alpha_Algorithmie_TD {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int t1[][]=new int[3][4];
        for ( i = 0; i<3; i++) {
            for ( j = 0; j <4;j++) {
                System.out.println("Entrez les donnees du tableaux");
                t1[i][j] =sc.nextInt();
            }
            // affichage
            for (int k = 0; k < 3; k++) {
                for (int k2 = 0; k2 <4; k2++) {
                    System.out.println(t1[k][k2]);
                    System.out.println("\n");
                }
            }
        }

    }
}
