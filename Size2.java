public enum Size2 {
    SMALL, MEDIUM, LARGE, EXTRALARGE;
    public static void main(String[] args) {
        System.out.println("la valeur de chaine de SMALL est :"+Size2.SMALL.toString());
        System.out.println("La valeur de chaine de MEDIUM est :"+Size2.MEDIUM.name());
    }
}
