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
        int res = factoriel(5);
        int fibo = suiteFibo(500);
        System.out.println(fibo);
        System.out.println(res);
    }
}
