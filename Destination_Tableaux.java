import java.util.Arrays;
public class Destination_Tableaux {
    public static void main(String[] args) {
        int[][] source = { { 1, 2, 3, 4 }, { 5, 6 }, { 0, 2, 42, -4, 5 } };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < source.length; ++i) {

            // allouer un espace 
            destination[i] = new int[source[i].length];
            System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
        }

        // affichage tableaux de destination 
        System.out.println(Arrays.deepToString(destination));
    }
}
