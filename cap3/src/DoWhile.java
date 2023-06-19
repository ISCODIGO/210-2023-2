import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular promedios...");
        System.out.println("Escribir numeros enteros mayores a cero.\nSi es negativo termina.");
        int valor = -1;
        int suma = 0;
        int conteo = 0;

        do {
            System.out.print("Escriba numero: ");

            try {
                valor = teclado.nextInt();  // Puede generar una excepcion
            } catch (Exception e) {
                valor = -1;
            }


            if (valor >= 0) {
                suma += valor;
                conteo++;
            }
        } while(valor >= 0);

        int promedio = suma / conteo;
        System.out.println("Promedio: " + promedio);
    }
}
