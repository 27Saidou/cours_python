import java.util.Scanner;
public class Emp {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("Entrez la premiere valeur de a");
        int a=clavier.nextInt();
        System.out.println("Entrez la valeur de B");
        int b=clavier.nextInt();
        float c=a+b;
        System.out.println("La somme des deux valeur est="+c);
        clavier.close();
    }
}
