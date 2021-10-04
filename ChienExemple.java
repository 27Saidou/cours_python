public class ChienExemple {
    String name,breed;
    public void jump(){
        System.out.println("mon Chien"+name+"jumped");
    }
    public void description(){
        System.out.println("Le nom de mon Chien est " + name + " et sa race est "+ breed);
    }
    public static void main(String[] args) {
        ChienExemple husky= new ChienExemple();
        husky.name="Husky";
        husky.breed="Browny";

        ChienExemple poodle= new ChienExemple();

        poodle.breed="Poodle";
        poodle.name="Mr.Moolchand Ji";
        // afficher le resulat
        husky.jump();
        husky.description();

        poodle.jump();
        poodle.description();
    }
}
