public class ProxyInternetAccess implements OfficielInternetAccess {
    private String employeeName;
    private RealInternetAccess realaccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realaccess = new RealInternetAccess(employeeName);
            realaccess.grantInternetAccess();
        } else {
            System.out.println("pas d\'access internet pour cette personne.votre job est de niveau 5");
        }
    }

    public int getRole(String emplName) {
        return 9;
    }
}
