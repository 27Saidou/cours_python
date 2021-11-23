import java.util.Scanner;
public class Example_Structure_Conditionelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre entier svp");
        int number=sc.nextInt();
        if (number>0) {
            System.out.println("ce nombre est positif");
        }else
        if (number<0) {
            System.out.println("ce nombre est negatif");
        }else {
            System.out.println(" ce nombre est egale a zero");
            sc.close();
        }
    }
}
