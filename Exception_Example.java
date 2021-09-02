public class Exception_Example {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("erreur sur "+e.getMessage());
        }finally {
            System.out.println("erreur dans le code ");
        }
    }
}
