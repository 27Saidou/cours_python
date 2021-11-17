import java.util.*;
public class Algorithme_Parite{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer la valeur de n");
        int n=sc.nextInt();
        int r=n%2;
        if(r==0){
            System.out.println(n+" est impair");
        }else{
            System.out.println(n+" est pair");
            sc.close();
        }
    }
}