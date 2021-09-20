public class Static_Binding extends basevehicle {
    public static void type_de_profile() {
        System.out.println("engineer python");
    }
    public static void main(String[] args) {
    basevehicle obj = new basevehicle();
    basevehicle obj1= new Static_Binding();
    obj.type_de_profile();
    obj1.type_de_profile();
    }
}
