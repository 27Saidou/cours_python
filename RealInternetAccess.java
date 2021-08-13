public class RealInternetAccess implements OfficielInternetAccess {
    private String employeeName;

    public RealInternetAccess(String empName) {
        this.employeeName = empName;
    }

    @Override
    public void  grantInternetAccess() {   
        System.out.println( "Acces Internet accorde à l'employe : " + employeeName ); 
    }
}
