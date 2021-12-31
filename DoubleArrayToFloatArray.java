public class DoubleArrayToFloatArray {
    public static void main(String[] args) {
        double[] doubleArray = { 3.5, 5.0, 7.5, 11.55 };
        float[] floatArray = new float[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            floatArray[i] = (float) doubleArray[i];
        }
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println("Element par Index " + i + " is : " + floatArray[i]);
        }
    }
}
