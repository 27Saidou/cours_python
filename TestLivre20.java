import javax.swing.JOptionPane;
public class TestLivre20 {
    public static void main(String[] args) {
        String nom=JOptionPane.showInputDialog("Entrer votre nom svp!");
        String prenom=JOptionPane.showInputDialog(" Entrer votre Prenom svp!");
        int age=Integer.parseInt(JOptionPane.showInputDialog("Entrer votre age svp!"));
        if (age<=18) {
            System.out.println(prenom+" "+nom+" "+age+ " ans est mineur" );
        } else {
            System.out.println(prenom+"  "+nom+" "+ age + " ans est majeur" );
        }
    }
}
