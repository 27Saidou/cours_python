public class EtudiantSinthian implements Volunter,Intern {

    @Override
    public void setVoltID(String voltID) {
        System.out.println("VoltID: " + voltID);
    }

    @Override
    public void setInterID(String interID) {
        System.out.println("InterId: " + interID);
    }

    public static void main(String[] args) {
        EtudiantSinthian e1 = new EtudiantSinthian();
        e1.setVoltID("diamant15Engineer");
        e1.setInterID("int09");

    }
}
