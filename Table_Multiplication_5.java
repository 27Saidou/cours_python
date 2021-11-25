import java.util.*;
public class Table_Multiplication_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la table de multiplication svp");
        int i= sc.nextInt();
        for ( i= 1; i<=10; i++) {
            int result=i*5;
            System.out.println(i +" * 5 = " + result);
            sc.close();
        }
    }
}
