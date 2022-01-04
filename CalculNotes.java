import java.util.*;

public class CalculNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int notes[],moyenne;
        notes = new int[4];
        for (i = 0; i<notes.length; i++) {
            System.out.println("Entrez les quatres notes " + i + 1);
            notes[i] = sc.nextInt();
        }
        moyenne = (notes[0] + notes[1] + notes[2] + notes[3])/4;
        System.out.println("Votre moyenne est de "+moyenne);
        sc.close();
    }
}
