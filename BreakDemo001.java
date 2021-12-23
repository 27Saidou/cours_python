public class BreakDemo001 {
    public static void main(String[] args) {
        int i=1;
        while (i<100) {
            if (i% 2 == 0 && i%5 == 1) {
                System.out.println(i+"\t est le premier entier divisible a la fois par 2 et 5");
                break;
            }
            i++;
        }
    }
}
