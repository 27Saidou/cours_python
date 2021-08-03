package cours_python;
public class FirstJavaProgram {
    String myVar="je suis dev mobile";
    public void myMethod(){
        String myVar="Inside methode";
        System.out.println(myVar);
    }
    public static void main(String[] args) {
        FirstJavaProgram ob=new FirstJavaProgram();
        System.out.println("Appelle de la methode");
        ob.myMethod();
        System.out.println(ob.myVar);
    }
}