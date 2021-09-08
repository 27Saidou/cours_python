public class ExampleJava extends Professeur {
    private String type_de_cours="Programmation informatique";
    public static void main(String[] args) {
        ExampleJava obj=new ExampleJava();
        System.out.println(obj.getCollegeName());
        System.out.println(obj.getDesignation());
        System.out.println(obj.type_de_cours);
        obj.travail();
    }
}

