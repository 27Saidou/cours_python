import java.util.*;

public class ArrayToMethode {
    public int max(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la taille svp");
        int size = sc.nextInt();
        int myArr[] = new int[size];
        System.out.println("Entrer les valeurs du tableau");
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = sc.nextInt();
        }
        ArrayToMethode ob = new ArrayToMethode();
        System.out.println("La valeur maximum dans le tableau est de  " + ob.max(myArr));
        System.out.println("La valeur minimum dans le tableau est de " + ob.min(myArr));
        sc.close();
    }
}
