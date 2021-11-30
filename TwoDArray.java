public class TwoDArray {
    public void afficher_tableau(int x[][]) {
        System.out.println("Matrix:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j] + " ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int x[][] = { { 1, 2 }, { 3, 4 } };
        TwoDArray arr = new TwoDArray();
        arr.afficher_tableau(x);
    }
}
