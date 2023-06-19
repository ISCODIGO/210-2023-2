import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        /*
        Crear un programa que permita que un usuario adivine un numero al azar [1].
        Este numero debe estar entre 1 y 50 al usuario se le dara una cantidad de intentos,


        si el usuario no adivina despues de esa cantidad de intentos pierde. Si adivina
        antes de gastar sus intentos... gana.

        La unica ayuda que tiene el usuario es la de saber si el numero es inferior o
        superior a la incognita.

        incognita = 34.

        0                              25       31     37             50
        32 33 34 35 36
         */

        final int MAXIMO = 50;

        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        int incognita = random.nextInt(1, MAXIMO + 1);  // 1 y 50
        int maxIntentos = (int) Math.ceil((Math.log10(MAXIMO) / Math.log10(2)));
        int conteoIntentos = 0;
        boolean seGano = false;
        System.out.println(incognita);

        while (!seGano && conteoIntentos < maxIntentos) {
            conteoIntentos++;
            System.out.println("Intento: " + conteoIntentos + " de " + maxIntentos);
            System.out.print("Escriba un numero: ");
            int valor = teclado.nextInt();

            if (valor == incognita) {
                seGano = true;
            } else if (valor < incognita) {
                System.out.println(valor + " < incognita");
            } else {
                System.out.println(valor + " > incognita");
            }
        }

        if (seGano) {
            System.out.println("Has ganado, la incognita era " + incognita);
        } else {
            System.out.println("Perdio...");
        }
    }
}

// -inf --------------------------------------  5 --- 5.6 ---- 6 ----- 7 ----- 8 ----
//