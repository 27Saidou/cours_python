public class Static_Binding extends BaseVehicule {
    public static void type_de_profile() {
        System.out.println("engineer python");
    }
    public static void main(String[] args) {
    new BaseVehicule();
    BaseVehicule obj1= new Static_Binding();
    Static_Binding.type_de_profile();
    obj1.type_de_profile();
    }
}
