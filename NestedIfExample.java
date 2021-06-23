public class NestedIfExample {
    public static void main(String[] args) {

        int num = 70;
        if (num < 100) {
            System.out.println("le nombre est inferieur a 100");
            if (num > 50) {
                System.out.println("le nombre est plus grand  que 50");
            }
        }
    }
}
