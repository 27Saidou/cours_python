public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficielInternetAccess oia= new ProxyInternetAccess("Alpha diallo");
        oia.grantInternetAccess();
    }
}
