public class DemoAppTest implements MyInterface {

    @Override
    public void method1() {
        System.out.println("je suis un dev web methode 1");
        
    }

    @Override
    public void method2() {
        System.out.println("je suis un dev mobile methode 2");
        
    }
    public static void main(String[] args) {
        MyInterface obj = new DemoAppTest();
        obj.method1();
        obj.method2();
    }
}
