import java.util.Scanner;

public class TrouverSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];
        int somme = 0;
        for (int i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
        }
        somme = find_sum(number);
        System.out.println("La somme est de " + somme + ".");
        sc.close();
    }

    public static int find_sum(int[] value)
    {
        int i;
        int total=0;
        for (i = 0; i < 10; i++) {
        total = total + value[i];
        }

        return (total);
    }
}
