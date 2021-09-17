
public class GenericDriver {
    public static void main(String[] args) {
        Special<String> list = new Special<String>();
        list.setmAttribut("engineer java");
        System.out.println(list.getmAttribut());
    }
}
