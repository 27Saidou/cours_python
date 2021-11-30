public class OneDArray {
    public void show(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + "");
        }
    }

    public static void main(String[] args) {
        int[] x = { 2, 3, 4, 5, 6, 7, 8 };
        OneDArray obj = new OneDArray();
        System.out.println("Affichage des valeurs du tableau ");
        obj.show(x);
    }
}
