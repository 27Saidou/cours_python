public class Factorielle_And_Fibo {
    public static int factoriel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * factoriel(n - 1));
        }
    }

    public static int suiteFibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (n * suiteFibo(n - 1) + suiteFibo(n - 2));
        }
    }
    public static void main(String[] args) {
        System.out.println(factoriel(5));
        System.out.println(suiteFibo(5));
    }
}
