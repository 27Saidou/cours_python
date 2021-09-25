import java.util.Scanner;

public class Functions {
    public static void printName(String name) {
        System.out.println("Hello " + name);
        return;
    }

    public static void printFactoriel(int n) {
        int factorial = 1;
        for (int i = n; i >=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static int calculateSum(int a ,int b){
        int res= a + b;
        return res;
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String name = clavier.nextLine();
        printName(name);
        System.out.println("Entrez un nombre");
        int n = clavier.nextInt();
        printFactoriel(n);
        System.out.println("donnez une valeur entier");
        int a= clavier.nextInt();
        System.out.println("Donnez un second valeur");
        int b= clavier.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("la somme de deux valeurs est de "+sum);
        clavier.close();
    }
}