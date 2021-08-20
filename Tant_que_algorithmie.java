import java.util.Scanner;
public class Tant_que_algorithmie {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int N=0;
        System.out.println("Entrez un nombre entre 1 et 3");
        while (N<1 || N>3) {
            N=clavier.nextInt();
            if (N<1 && N>3) {
                System.out.println("Recommencez Saisie erroné");
                N=clavier.nextInt();
                clavier.close();
            }
        }
    }
}
