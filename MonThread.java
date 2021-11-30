

public class MonThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Creation processus leger\n");
            Thread.sleep(1000);
            System.out.println("Fin du processus leger\n");
        } catch (Exception e) {
            System.out.println("Processus leger Interrupted\n");
        }
    }

    public static void main(String[] args) {
        MonThread thread = new MonThread();
        System.err.println("Demarrer le processus leger.....");
        thread.start();
        System.err.println("Le processus leger est demarrer");
    }
}
