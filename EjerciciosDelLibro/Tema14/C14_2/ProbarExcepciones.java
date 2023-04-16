package EjerciciosDelLibro.Tema14.C14_2;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* @file: ProbarExcepciones.java
* @info: Programa que define un mená con las opciones de los diferentes tipos de excepciones que pueden ocurrir.
* @author SantiTru
*/

public class ProbarExcepciones {

  public static void main (String [] args){
    Scanner teclado = new Scanner (System.in);

    int menu = 0;
//Inicimaos un bucle do-while para que se repita el menú hasta que el usuario marque la opción 6 "SALIR". 
   do{
      System.out.println("\nCONTROL DE EXCEPCIONES");
      System.out.println("1. Provoca un error SatckOverFlowError");
      System.out.println("2. Provoca un error NumberFormatException");
      System.out.println("3. Provoca un error ArrayIndexOutOfBoundsException");
      System.out.println("4. Provoca un error FileNotFoundException");
      System.out.println("5. Provoca un error ArithmeticException");
      System.out.println("6. Salir");
      System.out.print("Elige una opción: ");

      menu = teclado.nextInt();
//Definimos el try en el que incluimos el switch para cada una de las opciones del menú
      try{
        switch (menu){
          case 1:
            StackOver();
          break;
          case 2:
            NumberFormat();
          break;
          case 3:
            ArrayOut();
          break;
          case 4: 
           FileNotFound();
          break;
          case 5:
            Arithmetic();
          break;
          case 6:
            System.out.println("Hasta otra amigo!");
          break;

          default:
            System.out.println("Esa opción no esta en el menú. Prueba otra opción.");
        }
//Capturamos todas las excepciones que puedan ocurrir y mostramos su tipo y mensaje
      }catch(StackOverflowError e){
        System.out.println("Excepcion: " + e.getClass());
        System.out.println(("Error: " + e.getMessage()));
        System.out.print("Prueba otro error!");
      }catch(NumberFormatException e){
        System.out.println("Excepcion: " + e.getClass());
        System.out.println(("Error: " + e.getMessage()));
        System.out.print("Prueba otro error!");
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Excepcion: " + e.getClass());
        System.out.println(("Error: " + e.getMessage()));
        System.out.print("Prueba otro error!");
      }catch(FileNotFoundException e){
        System.out.println("Excepcion: " + e.getClass());
        System.out.println(("Error: " + e.getMessage()));
        System.out.print("Prueba otro error!");
      }catch(ArithmeticException e){
        System.out.println("Excepcion: " + e.getClass());
        System.out.println(("Error: " + e.getMessage()));
        System.out.print("Prueba otro error!");
      }
    }while(menu != 6); //opción de salida del menú principal
    System.out.print("Nos vemos pronto!");
    teclado.close();
  }

//Definimos las distintas funciones que provocaran las excepciones.

 public static void StackOver () throws StackOverflowError{
//Función recursiva que al llamarse a si misma provoca un bucle infinito y genera la excepción StackOverflowError
    StackOver();
 }
 public static void NumberFormat () throws NumberFormatException{
//Función que utiliza indevidamente un String en una variable Int para generar la excepción NumberFormatException
  String letras= "Esto deberia ser un número";
  int numero= Integer.parseInt(letras);
  System.out.print(numero);
 }
 public static void ArrayOut () throws ArrayIndexOutOfBoundsException{
//función que define un array de 3 elementos y provoca la excepción ArrayIndexOutOfBoundsException ya que se accede a un índice que no existe.
  int [] numeros = new int [3];
  numeros[10]=5;
  System.out.print(numeros[10]);
 }
 public static void FileNotFound () throws FileNotFoundException{
//Función que utiliza un archivo que no existe para generar la excepción FileNotFoundException. 
  java.io.FileReader documento = new java.io.FileReader("C:\\Users\\SantiTru\\Desktop\\fichero.txt");
  System.out.print(documento);
 }
 public static void Arithmetic () throws ArithmeticException{
//Función que utiliza una división entre 0 para generar la excepción ArithmeticException.
  int a=10;
  int b=0;
  int c=a/b;  
  System.out.print(c);
 }
}
