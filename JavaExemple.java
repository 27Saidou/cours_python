package cours_python;
public class JavaExemple  extends ParentClass{
    JavaExemple(){
        System.out.println("Constructeur de la class enfant");
    }
    void disp(){
        System.out.println("methode de la class enfant");
        super.disp();
    }
    public static void main(String[] args) {
        JavaExemple oo=new JavaExemple();
        oo.disp();
    }
}
