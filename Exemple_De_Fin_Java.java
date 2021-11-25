public class Exemple_De_Fin_Java {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.65;

        // converts into wrapper objects
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if (aObj instanceof Integer) {
            System.out.println("un objet Integer est creer");
        }

        if (bObj instanceof Double) {
            System.out.println("un objet Double est creer");
        }
        Integer cObj = Integer.valueOf(23);
        Double dObj = Double.valueOf(5.55);

        // converts into primitive types
        int c = cObj.intValue();
        double d = dObj.doubleValue();

        System.out.println("The value of a: " + c);
        System.out.println("The value of b: " + d);
    }
}
