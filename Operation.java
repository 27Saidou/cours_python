public class Operation {
    public  int somme(int x, int y) {
        return x + y;
    }

    public int somme(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println(op.somme(15, 18));
        System.out.println(op.somme(20,90, 72));
    }
    

}
