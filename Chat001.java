public class Chat001 {
    // L'état nous dit à quoi ressemble l'objet ou quelles propriétés il possede
    String name;
    int age;
    String color;
    String breed;

    /*
     * Instance methods: behaviors of Cat
     */
    void sleep() {
        System.out.println("Sleeping");
    }

    void play() {
        System.out.println("Playing");
    }

    void feed() {
        System.out.println("Eating");
    }

    void information_du_Chat() {
        System.out.println("Name=" + this.name);
        System.out.println("Age= " + this.age);
        System.out.println("Color= " + this.color);
        System.out.println("Breed= " + this.breed);

    }

    public static void main(String[] args) {
        Chat001 thor = new Chat001();
        Chat001 rambo = new Chat001();
        /*
         * Defining Thor chat001
         */
        thor.name = "Thor";
        thor.age = 3;
        thor.breed = "Russian Blue";
        thor.color = "Brown";
        thor.sleep();
        thor.information_du_Chat();
        /*
         * Defining Rambo chat001
         */
        rambo.name = "Rambo";
        rambo.age = 4;
        rambo.breed = "Maine Coon";
        rambo.color = "Brown";

        rambo.play();
        rambo.information_du_Chat();
    }
}
