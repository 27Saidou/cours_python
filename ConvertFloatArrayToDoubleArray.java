public class ConvertFloatArrayToDoubleArray {
    public static void main(String[] args) {
        float[] floatArray = { 2.0f, 1.5f, 8.45f, 116.77f };
        double[] doubleArray = new double[floatArray.length];
        for (int i = 0; i < floatArray.length; i++) {
            doubleArray[i] = (double) floatArray[i];
        }
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Element par Index " + i + " est : " + doubleArray[i]);
        }
    }
}
