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

    }
    
}
