import java.util.*;
public class Exemple_Fonction {
    public static int multi(int x){
        int y ;
        y=0;
        while (y<x) {
            y=y+1;
        }
        return y;
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une valeur entier svp");
        int a= sc.nextInt();
        multi(a);
        sc.close();

        int n1 = 60, n2 = 36, pgcd = 0;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                pgcd = i;
        }
        System.out.printf("PGCD de %d et %d est: %d", n1, n2, pgcd);

    }
    
}
