public class JavaFloatArrayExample {
    public static void main(String[] args) {
        // declaration float array
        float f[];
        // MEMORY ALLOCATION FOR JAVA FLOAT ARRAY
        f=new float[4];
        // ASSIGNING ELEMENTS TO JAVA FLOAT ARRAY
        f[0] = 10.10f;
        f[1] = 30.3f;
        f[2] = 40.60f;
        f[3] = 77.50f;
        // JAVA FLOAT ARRAY OUTPUT
        System.out.println("Java float array exemple");
        for (int i = 0; i < f.length; i++) {
            System.out.println("afficher les elements  par index: " + i + " " + f[i]);
        }
    }
}
