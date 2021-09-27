public class StringIntroduction {
    public static void main(String[] args) {
        String name="Alpha";
        String name2 = new String("Alpha  ");
        System.out.println(name.equals(name2));

        String nom="Alpha";
        nom=nom+"Diallo";
        System.out.println(nom.concat("developpeur web"));

        String prenom="massdou";
        prenom=prenom+"Diallo";
        System.out.println(prenom.replace('M', 'd'));
        
    }
}
