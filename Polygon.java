public interface Polygon extends Language {
    public void getAire(int length,int breadth);
    
    default void getSides() {
        System.out.println("Je peux obtenir les cotes d'un polygone");
    }
}
