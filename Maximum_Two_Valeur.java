import java.util.*;
public class Maximum_Two_Valeur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.println("Entrez la valeur de n1");
        int n1 = sc.nextInt();
        System.out.println("Entrez la valeur de n2");
        int n2 = sc.nextInt();
        if (n1>n2) {
            max=n1;
        } else {
            max=n2;
        }
        System.out.println("Le maximum entre " +n1+ " " +n2+ " est :"+max);
        sc.close();
    }
}
