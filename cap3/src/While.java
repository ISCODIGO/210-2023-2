import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular el N fibonacci...");
        System.out.print("Escriba N: ");
        int n = teclado.nextInt();
        int conteo = 2;
        int penultimo = 0;
        int ultimo = 1;
        int actual = 0;
        while(conteo <= n) {
            actual = penultimo + ultimo;
            penultimo = ultimo;
            ultimo = actual;
            conteo++;
        }
        System.out.println("Respuesta: " + actual);
    }
}
