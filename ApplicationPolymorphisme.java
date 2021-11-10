public class ApplicationPolymorphisme {
    public static void main(String[] args) {
        Audi a=new Audi("Toyota","Diesel",5,true);
        System.out.println(a.getModel());
        System.out.println(a.getCarburant());
        System.out.println(a.getNumberGear());
        System.out.println(a.isAuto());
        
    }
}
