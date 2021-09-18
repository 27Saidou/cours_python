public class ClassVariable {
    public static int intVar = 10;

    public static void main(String[] args) {
        ClassVariable obj = new ClassVariable();
        ClassVariable obj2 = new ClassVariable();
        System.out.println("Object1: " + obj.intVar);
        System.out.println("Object2: " + obj2.intVar);

        ClassVariable.intVar=20;
        System.out.println("Mise a jour du variable: " + ClassVariable.intVar);
        System.out.println("Apres mise a jour du variable: " + ClassVariable.intVar);
        System.out.println("appelle a la nouvelle objets: " + ClassVariable.intVar);
    }
}
