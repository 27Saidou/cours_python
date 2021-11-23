public class Example_String_Alfa {
    public static void main(String[] args) {

        String first = "java programmation";
        String second = "java programmation";
        String third = "python programmation";

        // compare le premier et le deuxieme
        boolean result1 = first.equals(second);
        System.out.println("les deux chaine de caractere sont egales: " + result1);

        // compare le premier et le troisiemes
        boolean result2 = first.equals(third);
        System.out.println("Les premieres et troisiemes chaines sont egales: " + result2);
    }
}
