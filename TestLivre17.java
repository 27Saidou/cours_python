import javax.swing.JOptionPane;
public class TestLivre17 {
    public static void main(String[] args) {
        int nombre1=Integer.parseInt(JOptionPane.showInputDialog("Entrer le premier nombre svp"));
        int nombre2 = Integer.parseInt(JOptionPane.showInputDialog("Entrer le second nombre svp"));
        int som=nombre1+nombre2;
        int diff=nombre1-nombre2;
        int prod=nombre1*nombre2;
        System.out.println("La somme de "+nombre1+" + "+nombre2 + "= " +som);
        System.out.println("La difference de "+ nombre1+ " - "+ nombre2 + " =" + diff);
        System.out.println("Le produit de " + nombre1+ " * "+nombre2 +" = "+prod);
        System.exit(0);
    }
}
