public class For {
    public static void main(String[] args) {
        // escribir numeros impares entre 50 y 100
        for(int i = 51, j = 0; i <= 100; i += 2, j++) {
            System.out.print(i + ": " + j + "\n");
        }

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println(total);

        total = 0;
        for(int elemento : arr) {  // foreach
            total += elemento;
        }

        System.out.println(total);
    }
}
