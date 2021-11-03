import javax.swing.JOptionPane;

public class Signe {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Entrer une valeur entier"));
        if (n<0) {
            System.out.println(n+" est un nombre negatif");
        }else if (n>0){
        System.out.println(n+" est un nombre positif");
        }else if(n==0){
            System.out.println(n+" est un nombre null");
        }
    }
}