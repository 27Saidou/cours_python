public class BreakDemo {
    public static void main(String[] args) {
        int i=1;
        while (i<100) {
            if (i%2==0 && i%5==0) {
                System.out.println(i+"\test le premier entier divisible par 2 et 5");
                break;
                
            }i++;
        }
    }
}
