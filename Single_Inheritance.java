public class Single_Inheritance extends Single_Parent {
    public void child_method() {
        System.out.println("Child class Method");
    }
    public static void main(String[] args) {
        Single_Inheritance obj =new Single_Inheritance();
        obj.parent_method();
        obj.child_method();
    }
}
