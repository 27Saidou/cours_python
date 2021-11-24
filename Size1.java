public enum Size1 {
    PETIT("la taille est petit"), 
    MOYEN("la taille est moyen"), 
    GRAND("la taille est grand"),
    EXTRALARGE("la taille est assez grand.");
    
    private final String pizzaSize;

    private Size1(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public String getSize() {
        return pizzaSize;
    }
    public static void main(String[] args) {
        Size1 s1=Size1.PETIT;
        System.out.println(s1.getSize());
    }
}
