public class ExampleAnimalApplication {
    public static void main(String[] args) {
        // object creation of the outer class
        ExampleAnimal animal=new ExampleAnimal();
        // object creation of the non-static class
        ExampleAnimal.Reptile reptile=animal.new Reptile();
        reptile.displayInfo();
        reptile.eat();
        // object creation of the static nested class
        ExampleAnimal.Mammifere mammifere=new ExampleAnimal.Mammifere();
        mammifere.displayInfo();
        
    }
}
