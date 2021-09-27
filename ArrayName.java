import java.util.Scanner;

public class ArrayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre d'etudiant");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int moy_Notes=0;
        for (int i = 0; i < n; i++) {
            moy_Notes+=marks[i];
        }
        moy_Notes/=n;
        System.out.println("La moyenne des notes est="+moy_Notes);
        sc.close();
    }
}