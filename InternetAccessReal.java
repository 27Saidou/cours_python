public class InternetAccessReal implements OfficielInternetAccess {
    private String employeeName;

    public InternetAccessReal(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("autorisation accorder a cette employee" + employeeName);

    }

}
