public class ContinueDemo001 {
    public static void main(String[] args) {
        int i=1;
        while (i<10) {
            if (i==4) {
                i+=1;
                continue;
            } else {
                System.out.println(i+"\t");
                i+= 1;
            }
        }
    }
}
