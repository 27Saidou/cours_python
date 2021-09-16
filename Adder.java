public class Adder {
    // example de surcharge de methode en java
    static int add(int a, int b) {
        int res = a + b;
        return res;
    }

    static int add(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public int maMethode(int a, int b) {
        int alpha = a + b;
        return alpha;
    }

    public double maMethode(double a, double b) {
        double res = a + b;
        return res;
    }

    void multiply(int a, int b) {
        System.out.println("Le Resultat est " + (a * b));
    }

    void multiply(int a, int b, int c) {
        System.out.println("Le resultat est" + (a * b * c));
    }

    public int sum(int x, int y) {
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public double sum(double x, double y) {
        return (x + y);
    }

    public static void main(String[] args) {
        Adder obj = new Adder();
        System.out.println(obj.maMethode(11, 11));
        System.out.println(obj.maMethode(12.3, 12.6));
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
        obj.multiply(8, 5);
        obj.multiply(4, 6, 2);
        System.out.println(obj.sum(18, 56));
        System.out.println(obj.sum(12, 13, 14));
        System.out.println(obj.sum(15.6, 17.9));

    }
}
