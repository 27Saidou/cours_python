enum Taille {
    PETIT, MOYEN, GRAND, EXTRALARGE;

    public String getSize() {
        switch (this) {
        case PETIT:
            return "petit";

        case MOYEN:
            return "moyen";

        case GRAND:
            return "grand";

        case EXTRALARGE:
            return "Assez grand";

        default:
            return null;

        }
    }
    public static void main(String[] args) {
        System.out.println(Taille.PETIT.getSize());
    }
}
