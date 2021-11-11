public class StaffHonda extends StaffBike {

    @Override
    void run() {
        System.out.println("Les motos courent vite");

    }
    public static void main(String[] args) {
        StaffBike bike = new StaffHonda();
        bike.run();
    }
}
