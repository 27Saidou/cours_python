public class AlphaBanque implements Banque {
    private  final String bName;
    AlphaBanque(){
        bName="bceao";
    }
    public String getBanqueName(){
        return bName;
    }
}
