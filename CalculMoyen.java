import java.util.Scanner;

public class CalculMoyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notes[], moy;
        notes = new float[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Entrez les notes numero" + i + 1);
            notes[i] = sc.nextFloat();
        }
        moy = (notes[0] + notes[1] + notes[2] + notes[3]) / 4;
        System.out.println("La moyenne est :" + moy);
        sc.close();
    }
}