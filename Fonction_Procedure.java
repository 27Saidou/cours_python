public class Fonction_Procedure {
    public static void prod(int a) {
        boolean b=true;
        int d;
        d = 2;
        while (d <= a / 2 && b == true) {
            if (a % 2 == 0) {
                b = false;
            } else {
                d += 1;
            }
            if (a == 0) {
                System.out.println(a + " est Premier ");
            } else {
                System.out.println(a + " n'est pas Premier ");
            }
        }
    }

    public static void main(String[] args) {
        prod(15);
    }
}
