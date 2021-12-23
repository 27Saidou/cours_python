public class WhileDemo {
    public static void main(String[] args) {
        System.out.println("Test parite");
        int i=0;
        while (i<11) {
            if (i% 2 == 0) {
                System.out.println(i+"\t est Paire");
            }
            i+=1;
        }
    }
}
