public class Dynamic_Binding extends BaseVehiculeClass {
    public void speed() {
        System.out.println("The Speed of Dynamic Binding Class");
    }
    public static void main(String[] args) {
        BaseVehiculeClass obj=new BaseVehiculeClass();
        BaseVehiculeClass obj1=new Dynamic_Binding();
        obj.speed();
        obj1.speed();
    }
}
