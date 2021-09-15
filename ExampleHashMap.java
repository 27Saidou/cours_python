import java.util.*;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "Java");
        map.put(11, "PHP");
        map.put(12, "Python");
        map.put(13, "HTML5");

        System.out.println("La taille du map est: " + map.size());

        // Parcourir les éléments du Map
        for (Map.Entry<Integer, String> mp : map.entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue());
        }

        map.remove(11, "PHP");
        System.out.println("Apres la suppression: " + map);
}
}
