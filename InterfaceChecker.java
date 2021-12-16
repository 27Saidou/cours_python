interface Runnable {
    int a=10;
    void run();
}
public class InterfaceChecker implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Engineer java");
        
    }

    public static void main(String[] args) {
        Runnable app=new InterfaceChecker();
        app.run();
    }
}
