public class Instruction_Continue {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i <= 3) {
            System.out.println("sortir de la boucle : " + i);
            while (j <= 3) {

                if (j == 2) {
                    j++;
                    continue;
                }
                System.out.println("Exterieur boucle: " + j);
                j++;
            }
            i++;
        }
    }
}
