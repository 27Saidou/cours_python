public class JavaCasting {
    public static void main(String[] args) {
        // byte-> short-> char-> int-> long-> float-> ->double automatique
        // double-> float-> long-> int-> char-> short-> ->byte manuelle casting
        int myInt = 9;
        // casting automatique
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.printf("%f\n", myDouble);
    }
}
