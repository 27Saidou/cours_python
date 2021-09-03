public class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        System.out.println(car.brand + " " + car.modelName);
    }
}
