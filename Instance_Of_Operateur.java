public class Instance_Of_Operateur {
    public static void main(String[] args) {
        String str="Programmation";
        boolean result=str instanceof String;
        System.out.println("Est-ce que str est un objet de String :" +result);

        int februaryDays = 29;
        String resultat;
        // ternary operator
        resultat = (februaryDays == 28) ? "Annee pas bissextile" : "Annee bissextile ";
        System.out.println(resultat);

    }
}
