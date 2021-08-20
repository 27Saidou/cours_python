import java.util.Scanner;
public class Test_Algorithmique{
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int n,m;
        System.out.println("Donnez la premier valeur de n");
        n=clavier.nextInt();
        System.out.println("Donnez la second valuer m");
        m=clavier.nextInt();
        if (n>0 && m>0 || (n<0 && m<0)){
            System.out.println("leurs produits est positif");
        }else{
            System.out.println("leurs produits est negatifs");
            clavier.close();
        }
    
    }
}