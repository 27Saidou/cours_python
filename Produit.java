import javax.swing.JOptionPane;

public class Produit {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog(" Entrer votre code du produit");
        String reference = JOptionPane.showInputDialog("Entrer la reference du produit svp!");
        int prix_Unitaire = Integer.parseInt(JOptionPane.showInputDialog("Entrer le prix unitaire "));
        int quantite_Stock = Integer.parseInt(JOptionPane.showInputDialog("Entrer la quantite en stock "));
        int VSTOCK = prix_Unitaire * quantite_Stock;
        System.out.println(code + " " + reference + " " + prix_Unitaire + " " + quantite_Stock);
        System.out.println("La valeur de stock est :" + VSTOCK);
    }
}
