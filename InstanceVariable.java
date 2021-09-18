public class InstanceVariable {
    public String instVariable = "Engineer java";
    public static void main(String[] args) {
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
        System.out.println(obj1.instVariable);
        System.out.println(obj2.instVariable);
        // modification de la variable d'instance
        obj1.instVariable ="Engineer Python";
        System.out.println(obj1.instVariable);
        System.out.println(obj2.instVariable);
    }
}
