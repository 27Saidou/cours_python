package cours_python;
import java.util.regex.*;

public class Java_Regex_Eample {
    public static void main(String[] args) {
        String content = "c'est alpha diallo " + "from SinthiansLivre.com.";
        String pattern = ".*Livre.*";
        boolean isMatch=Pattern.matches(pattern,content);
        System.out.println("Le text contient'livre'? " + isMatch);
    }
}
