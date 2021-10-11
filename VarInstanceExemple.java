public class VarInstanceExemple {
    String profession="je suis developeur python";
    // variable d'instance
    String myVar = "instance variable";

    public String getProfession(String profession) {
    return profession;
    }
    public void myAffiche(){
        // variable local
        String myVar = "instance local";
        System.out.println(myVar);
    }
    public static void main(String[] args) {
        VarInstanceExemple obj = new VarInstanceExemple();
        VarInstanceExemple ob1 = new VarInstanceExemple();
        VarInstanceExemple ob2 = new VarInstanceExemple();
        ob2.profession="je suis developeur java";
        System.out.println(obj.profession);
        System.out.println(ob1.profession);
        System.out.println(ob2.profession);
        System.out.println(obj.getProfession("Engineer Java"));
        System.out.println("=============================== call methode");
        obj.myAffiche();
        System.out.println(ob1.myVar);
    }
}
