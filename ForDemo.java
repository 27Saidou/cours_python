public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            System.out.println(i);
        }
        System.out.println("Test de parite");
        for (int i = 0; i <11; i++) {
            if (i% 2 == 0) {
                System.out.println(i+"\t est paire");
            }
            
        }
    }
}
