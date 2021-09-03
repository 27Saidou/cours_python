public class BoucleTantQue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("===============");
        int v = 0;
        do {
            System.out.println(v);
            v++;
        } while (v < 5);
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String ix : cars) {
            System.out.println(ix);
        }
    }
}
