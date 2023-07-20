import java.util.Arrays;

public class Arreglo2D {
    public static void main(String[] args) {
        int[][] matriz = new int[6][4];

        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz));  // no nos sirve
        System.out.println(Arrays.deepToString(matriz));
        /*
        [0] -> [0, 0, 0, 0]
        [1] -> [0, 0, 0, 0]
        [2] -> [0, 0, 0, 0]
         */

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
