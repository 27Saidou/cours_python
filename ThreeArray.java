public class ThreeArray {
    public static void main(String[] args) {
        // create un tableau a trois dimension
        int[][][] test = { { { 1, -2, 3 }, { 2, 3, 4 } }, { { -4, -5, 6, 9 }, { 1 }, { 2, 3 } } };
        for (int[][] array2D : test) {
            for (int[] array1D : array2D) {
                for (int article : array1D) {
                    System.out.println(article);
                }
            }
        }
    }
}