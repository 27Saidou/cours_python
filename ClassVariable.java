public class ClassVariable {
    public static int intVar = 10;

    public static void main(String[] args) {
        System.out.println("Object1: " + ClassVariable.intVar);
        System.out.println("Object2: " + ClassVariable.intVar);

        ClassVariable.intVar=20;
        System.out.println("Mise a jour du variable: " + ClassVariable.intVar);
        System.out.println("Apres mise a jour du variable: " + ClassVariable.intVar);
        System.out.println("appelle a la nouvelle objets: " + ClassVariable.intVar);
    }
}
