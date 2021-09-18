public class LocalVariable {
    String myVar = "Developpeur mobile";
    
    public void localTestMethod() {
        String localvar = "je suis un dev web et mobile";
        System.out.println("Afficher la variable locale: " + localvar);
    }
    public static void main(String[] args) {
        LocalVariable obj = new LocalVariable();
        obj.localTestMethod();
        System.out.println("Afficher les variables d'instance: " + obj.myVar);
    }
}
