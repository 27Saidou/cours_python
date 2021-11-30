public class ThreeArrayTab {
    public static void main(String[] args) {
        int[][][] arr = { { { 1, 2 }, { 3, 4 } },
                { { 5, 6 }, { 7, 8 } } };
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        for (int j2 = 0; j2 < arr[j].length; j2++) {
                            System.out.print(arr[i][j][j2] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
    }
}
