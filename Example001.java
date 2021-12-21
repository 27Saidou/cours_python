public class Example001 {
    static int i=100;
    static String s="Java is the best language programming";
    static void affiche(){
        System.out.println(i);
        System.out.println(s);
    }
    void affiche_info(){
        affiche();
    }
    public static void main(String[] args) {
        Example001 obj = new Example001();
        obj.affiche_info();
        affiche();
    }
}
