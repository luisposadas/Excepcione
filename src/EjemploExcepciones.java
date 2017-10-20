import java.io.File;
import java.util.Scanner;
import java.util.*; //esto importa todo lo de java.util
import java.io.FileNotFoundException;

public class EjemploExcepciones {
        public static void main(String[] args) throws FileNotFoundException //throws lo lanza solamente
        {

                try {
                        File archivo = new File("entrada.txt");
                        Scanner teclado = new Scanner(archivo);
                        //System.out.println("Escribir el Primer Numero: ");
                        int num1 = teclado.nextInt(); //nos lee lo que pusimos
                        System.out.println("Escribir el Segundo Numero: ");
                        int num2 = teclado.nextInt();// toma el siguiente numero entero
                        //System.out.println("La division es: " + num1 / num2);
                } catch (ArithmeticException e) {
                        System.out.println("Division por cero");
                } catch (InputMismatchException e) {
                        System.out.println("pon numeros enteros");
                }
        }
}







