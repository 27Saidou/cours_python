public class TableauxMulti {
    public static void main(String[] args) {
        int [][]scores={{ 5,3,6,15,3},{3,8,4},{18,14,2,9}};
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j <scores[i].length;j++) {
                System.out.println(scores[i][j]+"");
            }
            
        }
    }
}
