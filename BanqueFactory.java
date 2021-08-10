class BanqueFactory extends AbstractFactory {
    public Banque getBanque(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase("bceao")) {
            return new AlphaBanque();
        } else if (bank.equalsIgnoreCase("ECOBANK")) {
            return new NafiouBanque();
        } else if (bank.equalsIgnoreCase("BICIS")) {
            return new RamatoulayeBanque();
        }
        return null;
    }

    public Loan getLoan(String loan) {
        return null;
    }
}
