import java.util.Arrays;
public class FillFloatArrayExample {
    public static void main(String[] args) {
        float[] float_array = new float[10];
        Arrays.fill(float_array, 1f);
        for (int i = 0; i < float_array.length; i++) {
            System.out.println("float array Element par : " + i + " " + float_array[i]);
        }
    }
}
