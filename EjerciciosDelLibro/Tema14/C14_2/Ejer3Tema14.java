package EjerciciosDelLibro.Tema14.C14_2;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
* @file: Ejer3Tema14.java
* @info: Realiza un programa que genere una excepción de forma aleatoria de entre
*        las siguientes excepciones: NumberFormatException, IOException, FileNotFoundException,
*        IndexOutOfBoundsException y ArithmeticException.
* @author SantiTru
*/

public class Ejer3Tema14 {
  public static void main(String[] args) {
//Generamos un número aleatorio entre 0 y 4
    int numeroAleatorio=(int)(Math.random()*5);
//Mostramos un menú con los posibles errores y el número aleatorio generado
    System.out.println("\nErrores aleatorios");
    System.out.println("1. Error NumberFormatException");
    System.out.println("2. Error IOException");
    System.out.println("3. Error FileNotFoundException");
    System.out.println("4. Error IndexOutOfBoundsException");
    System.out.println("5. Error ArithmeticException");
    System.out.println("Error generado aleatoriamente número: "+ (numeroAleatorio+1));
//Hacemos un bloque try-catch para capturar la excepción generada aleatoriamente y mostrar su tipo y mensaje.
    try {
      switch (numeroAleatorio) {
        case 0:
          throw new NumberFormatException();
        case 1:
          throw new IOException();
        case 2:
          throw new FileNotFoundException();
        case 3:
          throw new IndexOutOfBoundsException();
        case 4:
          throw new ArithmeticException();
      }
      
    } catch (Exception e) {
      System.out.println("Exception type: " + e.getClass());
      System.out.println("Exception message: " + e.getMessage());
    }
  }
}