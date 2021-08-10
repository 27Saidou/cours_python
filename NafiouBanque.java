public class NafiouBanque implements Banque {
    private String bName;
    NafiouBanque(){
    bName = "ECOBANK";
    }
    public String getBanqueName() {
        return bName;
    }
}
