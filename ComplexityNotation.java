import java.util.*;
public class ComplexityNotation {
     static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez la valeur de N!!");
        int N=sc.nextInt();
        for (int i = 0; i < N; i++)
            for (int j = 0; j < i; j++)
                count++;
                System.out.println(count);
                sc.close();

    }

}
