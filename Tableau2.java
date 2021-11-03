public class Tableau2 {
    public static void main(String[] args) {
        int tab1[][]=new int[3][4];
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j <4; j++) {
                tab1[i][j] =i+j;
                int tab2[][]={{ -9,1 },{3,8,5},{13,7,-6,0}};
                afficher(tab1);
                System.out.println();
                afficher(tab2);
            }
            
        }
    }
    // permet d'afficher les informations du matrices
    public static void afficher(int t[][]){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println("  " + t[i][j]);
            }
        }
    }
}
