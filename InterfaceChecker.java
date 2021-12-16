interface Runnable {
    int a=10;
    void run();
}

interface DefaultInterface extends Runnable{
    void sleep();
}
public class InterfaceChecker implements DefaultInterface {
    
    @Override
    public void sleep() {
        System.out.println("Sleeping...");
        
    }

    @Override
    public void run() {
        System.out.println("Engineer java");
        
    }

    public static void main(String[] args) {
        DefaultInterface app=new InterfaceChecker();
        app.run();
        app.sleep();
    }
}
