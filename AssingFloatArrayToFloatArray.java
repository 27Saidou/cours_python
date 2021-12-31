public class AssingFloatArrayToFloatArray {
    public static void main(String[] args) {
        float[] f, f2;
        f = new float[4];
        f[0] = 10.10f;
        f[1] = 30.3f;
        f[2] = 40.60f;
        f[3] = 77.50f;
        f2 = f;
        System.out.println("Java float Array Example");
        System.out.println("valeur de f du tableau");
        for (int i = 0; i < f.length; i++) {
            System.out.println("Element par Index : " + i + " " + f[i]);
        }
        System.out.println("valeur de f2 du tableau");
        for (int i = 0; i < f2.length; i++) {
            System.out.println("Element par Index : " + i + " " + f2[i]);
        }
    }
}
