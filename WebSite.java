
public class WebSite {
    String webName;
    int webAge;

    WebSite(String webName, int webAge) {
        this.webName = webName;
        this.webAge = webAge;
    }

    public static void main(String[] args) {
        WebSite ob = new WebSite("Google", 18);
        System.out.println(ob.webName);
        System.out.println(ob.webAge);

    }
}
