import javax.swing.JOptionPane;
public class Application1 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Entrer une valeur positif"));
        int result=n*n*n;
        System.out.println("le cube de "+n+" est ="+result);
    }
}
