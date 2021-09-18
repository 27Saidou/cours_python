public class Static_Binding extends basevehicle {
    public static void speed() {
        System.out.println("The Speed of Static Binding Class");
    }
    public static void main(String[] args) {
        basevehicle obj = new basevehicle();
        basevehicle obj1 = new Static_Binding();
        obj.speed();
        obj.speed();
    }
}
