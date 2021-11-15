import java.util.*;
public class Sorting {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // PGCD de deux nombres
    public static int pgcd(int n1,int n2){
            if (n1==n2) {
                return n1;
            }else{
                if (n1>n2) 
                    return pgcd(n1-n2,n2);
                else
                return pgcd(n1,n2-n1);
            }
        }
        public static void printFactoriel(int n){
            if (n<0) {
                System.out.println("Nombre Invalid");
                return;
            }
            int factoriel =1;
            for (int i = n; i >=1; i--) {
                factoriel=factoriel*i;
                
            }
            System.out.println(factoriel);
            return;
        }
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
        System.out.println(pgcd(60,15));

        Scanner sc = new Scanner(System.in);
        System.out.println("Taper un nombre entier");
        int n= sc.nextInt();
        printFactoriel(n);
        sc.close();

        
        
    }
}
