public class DeclareFloatArrayWithFloatVariables {
    public static void main(String[] args) {
        float f[], f2;
        f = new float[4];
        f[0] = 10.10f;
        f[1] = 30.3f;
        f[2] = 40.60f;
        f[3] = 77.50f;
        f2 = 555.55f;
        System.out.println("Java float Array Example");
        System.out.println("les valeurs de f2 est : " + f2);
        for (int i = 0; i < f.length; i++) {
            System.out.println("Element par Index : " + i + " " + f[i]);
        }
    }
}
