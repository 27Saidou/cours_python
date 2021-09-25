import java.util.Scanner;
public class Condition_Tp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (a==b) {
            System.out.println("les deux valeurs sont egales");
        }else if(a>b){
        System.out.println("a est plus grand que b");
        }else{
            System.out.println("plus petit");
            sc.close();
        }
    }
}
