import java.util.ArrayList;
public class Parcours_List_foreach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("Php");
        list.add("Js");
        list.add("SpringBoot");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
