import java.util.Scanner;
public class ArrayExemple {

    static Scanner sc = new Scanner(System.in);    public static void main(String[] args) {
        int  numNoms=getInt("Nombre d'entree du tableau");
        String[]noms=new String[numNoms];
        for (int i = 0; i < noms.length; i++) {
            noms[i] =getString("Entrer numero"+(i+1));
        }
        for (int i = 0; i < noms.length; i++) {
            System.out.println(noms[i]);
        }
    }
    public static int getInt(String prompt) {
        System.out.println(prompt+" ");
        int entier=sc.nextInt();
        return entier;
    }
    public static String getString(String prompt){
        System.out.println(prompt +" ");
        return sc.nextLine();
    }
}
