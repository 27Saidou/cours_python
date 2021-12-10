import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaOrnekler {
    public static void main(String[] args) {
        Date date1 = null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Entrez une  date  valide (gg/aa/yy):");
        String cinput = input.nextLine();
        try {
            if (null != cinput && cinput.trim().length() > 0) {
                date1 = format.parse(cinput);
            }
            System.out.print(date1);
            input.close();
        } catch (ParseException e) {
            System.out.println("ParseException" + e.getMessage());
        }

    }

}
