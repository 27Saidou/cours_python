import java.util.Scanner;
public class AlgorithmeFonction 
{
    static int b;
    public static int Abs_value(int nb){
        int absolue_value;
        if (nb>=0) {
            absolue_value = nb;
        } else {
            absolue_value=-nb;
        }
        return absolue_value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la valeur de A");
        int a=sc.nextInt();
        b=Abs_value(a);
        System.out.println("La valeur absolue de "+a+" et "+b);
        sc.close();
    }
}
