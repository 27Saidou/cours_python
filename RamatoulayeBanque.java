public class RamatoulayeBanque implements Banque {
    private final String bName;
    RamatoulayeBanque(){
        bName="BICIS";
    }
    public String getBanqueName() {
        return bName;
    }
}
