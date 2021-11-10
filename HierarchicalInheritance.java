public class HierarchicalInheritance {
    public static void main(String[] args) {
        Bus bus=new Bus();
        bus.setSeatingCapacity(24);
        bus.setPermitNo("ck1234");
        StaffCar car=new StaffCar();
        car.setSeatingCapacity(4);
        car.setColor("Black");
        System.out.println("Numero est de :"+bus.getPermitNo());
        System.out.println("Capacity est de :"+bus.getSeatingCapacity());
        System.out.println("Couleur de la voiture est  :"+car.getColor());
        System.out.println(car.getSeatingCapacity());
    }
}
