public class CarApplication {
    public static void main(String[] args) {
        CarStaff car1 = new CarStaff("mazda", "8WD");
        CarStaff.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Type de moteur pour 8WD= " + engine.getEngineType());

        CarStaff car2 = new CarStaff("Crysler", "4WD");
        CarStaff.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Type de moteur pour 4WD = " + c2engine.getEngineType());
    }
}
