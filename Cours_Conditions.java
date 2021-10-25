import java.util.*;
public class Cours_Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Entrez la valeur de A!");
        a=sc.nextInt();
        System.out.println("Entrez la valeur de B!");
        b=sc.nextInt();
        System.out.println("Entrez la valeur de C!");
        c=sc.nextInt();
        if (a==b || b==c) {
            System.out.println("deux valeurs sont identiques");
            sc.close();
        }
    }
}
