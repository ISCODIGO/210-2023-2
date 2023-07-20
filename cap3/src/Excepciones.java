import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Divisiones a/b...");
        //teclado.close();
        try {
            // try - codigo que podria generar excepcion
            System.out.print("Defina a: ");
            int a = teclado.nextInt();
            System.out.print("Defina b: ");
            int b = teclado.nextInt();

            System.out.println("El resultado es: "  + (a / b));
        } catch(InputMismatchException e1) {
            // catch - colocar el manejo en caso de excepcion
            System.out.println(e1.getMessage());
        } catch(ArithmeticException e2) {
            System.out.println(e2.getMessage());
        } catch(Exception e3) {
            System.out.println(e3.getMessage());
        }

        System.out.println("Programa Finalizado");
    }
}

/*

Exception
<- RuntimeException
<- NoSuchElementException
<- InputMismatchException

Exception
<- RuntimeException
<- ArithmeticException
 */