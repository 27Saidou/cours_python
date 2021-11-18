public class Td_Factorielle {
    public static void main(String[] args) {
        System.out.println(factoriel(5));
        ;
    }

    public static int factoriel(int n) {
        int i, f;
        f = 1;
        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}