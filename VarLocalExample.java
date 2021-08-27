public class VarLocalExample {
    // instance variable
    public String myVar = "instance variable";
    public void myMethod() {
        // variable local
        String  myVar ="je suis un dev java";
        System.out.println(myVar);
    }
    public static void main(String[] args) {
        VarLocalExample value= new VarLocalExample();
        System.out.println("Appelle de la methode");
        value.myMethod();
        System.out.println(value.myVar);
    }
}
