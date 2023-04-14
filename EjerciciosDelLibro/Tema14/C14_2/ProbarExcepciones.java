package EjerciciosDelLibro.Tema14.C14_2;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.io.FileNotFoundException;

public class ProbarExcepciones {

  public static void main (String [] args){
    Scanner teclado = new Scanner (System.in);

    int menu = 0;

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
    }while(menu != 6);
    System.out.print("Nos vemos pronto!");
    teclado.close();
  }
 public static void StackOver () throws StackOverflowError{
//Función recursiva que al llamarse a si misma provoca un bucle infinito y genera la excepción StackOverflowError
    StackOver();
 }
 public static void NumberFormat () throws NumberFormatException{
  String letras= "Esto deberia ser un número";
  int numero= Integer.parseInt(letras);
  System.out.print(numero);
 }
 public static void ArrayOut () throws ArrayIndexOutOfBoundsException{

 }
 public static void FileNotFound () throws FileNotFoundException{

 }
 public static void Arithmetic () throws ArithmeticException{

 }
}
