import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier nombre !");
        int firstNumber = sc.nextInt();
        System.out.println("Entrez le second nombre");
        int secondNumber = sc.nextInt();
        System.out.println("=================================");
        int result = maxOf(firstNumber, secondNumber);
        System.out.println(result);

        int c = 34;
        int d = 12;
        echanger_deux_variable(c, d);
        System.out.println("Apres la permutation les valeurs de a est:" + c + " et la valeur de b est:" + d);
        sc.close();

        // exemple de methode en java
        salutations();
        salutations("Good morning",5);

    }

    /**
     * cette methode permet de faire le maximum de deux valeurs
     * 
     * @param a
     * @param b
     * @return
     */
    static int maxOf(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /** cette methode permet de faire la permutation de deux variables */
    static void echanger_deux_variable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }

    public static void salutations() {
        System.out.println("Hi,There");
    }

    public static void salutations(String s) {
        System.out.println(s);
    }

    public static void salutations(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

}
