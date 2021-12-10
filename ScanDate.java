import java.util.*;
import java.text.*;

public class ScanDate {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Eample: 12-25-2103");
        System.out.print("Entrez une  date: ");
        String str = sc.nextLine();

        try {
            Date date = sdf.parse(str);

            sdf = new SimpleDateFormat("EEE, d MMM yyyy");
            System.out.println("Date: " + sdf.format(date));
        } catch (ParseException e) {
            System.out.println("Parse Exception");
        }
        sc.close();
    }
}