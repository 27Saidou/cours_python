public class AlfaSum {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    int add(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    int add(int n1, int n2, int n3, int n4, int n5) {
        return n1 + n2 + n3 + n4 + n5;
    }
    public static void main(String[] args) {
        AlfaSum obj = new AlfaSum();
        System.out.println("Somme de deux nombres: " + obj.add(20, 21));
        System.out.println("Somme de trois nombres : " + obj.add(20, 21, 22));
        System.out.println("Somme de quatre nombres: " + obj.add(20, 21, 22, 23));
        System.out.println("Somme de cinq nombres: " + obj.add(20, 21, 22, 23, 24));
    }
}
