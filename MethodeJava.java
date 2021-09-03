public class MethodeJava {
    //Une méthode est un bloc de code qui ne s'exécute que lorsqu'il est appelé
    public  static void je_Suis_une_Une_Methode(){
        System.out.println("je suis un developeur java mobile");
    }
    
    static void myMethod(String fname, int age) {
        System.out.println(fname + " est " + age);
    }
    
    static int myMethode(int x) {
        return 5 + x;
    }
    
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        je_Suis_une_Une_Methode();
        myMethod("Alfa",18);
        System.out.println(myMethode(5));
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
