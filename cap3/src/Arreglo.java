import java.util.Arrays;

public class Arreglo {
    public static void main(String[] args) {
        // Declarar arrays
        int[] arr = new int[9];
        System.out.println(arr.length);

        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));

        arr[1] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("Uso de for...");
        // for [lectura, escritura]
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = i;
            }
        }
        System.out.println(Arrays.toString(arr));

        // foreach [lectura]
        System.out.println("Uso de foreach...");
        for(int item : arr) {
            item = 22;
        }

        System.out.println(Arrays.toString(arr));

    }
}
