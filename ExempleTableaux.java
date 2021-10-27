public class ExempleTableaux {
    public static void main(String[] args) {
        int premiersNombres[][] = { { 0, 2, 4, 6, 8 }, { 1, 3, 5, 7, 9 } };
        for (int i = 0; i < premiersNombres.length; i++) {
            for (int j = 0; j < premiersNombres[i].length; j++) {
                System.out.println(premiersNombres[i][j]);
            }
        }
    }
}
