import java.util.Scanner;
public class Temperature_algo {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int temp;
        System.out.println("Entrez la valeur de la temperature");
        temp=clavier.nextInt();
        if (temp<=0) {
            System.out.println("c'est la glace");
        }else if(temp<100) {
            System.out.println("c'est du liquide");
    }else {
        System.out.println("c'est du solide");
        clavier.close();
    }
}
}
