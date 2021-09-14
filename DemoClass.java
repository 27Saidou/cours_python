public class DemoClass implements SecondInterface {

    @Override
    public void un_Autre_Methode() {
    System.out.println("engineer java");
        
    }

    @Override
    public void myMethod() {
        System.out.println("engineer python");
        
    }
    public static void main(String[] args) {
        DemoClass test=new DemoClass();
        test.myMethod();
        test.un_Autre_Methode();
    }
}
