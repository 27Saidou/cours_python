public class ProxyAccessInternet implements OfficielInternetAccess {
    private String employeeName;
    private InternetAccessReal realaccess;

    public ProxyAccessInternet(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realaccess = new InternetAccessReal(employeeName);
            realaccess.grantInternetAccess();
        } else {
            System.out.println("Vous n'etes pas autoriser a acceder a internet");
        }
    }

    public int getRole(String employeeName) {
        return 9;
    }
}
