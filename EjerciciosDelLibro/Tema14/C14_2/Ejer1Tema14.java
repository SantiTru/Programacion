package EjerciciosDelLibro.Tema14.C14_2;
import java.util.Scanner;

/**
* @file: Ejer1Tema14.java
* @info: Realiza un programa que pida 6 números por teclado y nos diga cuál es el
*        máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
*        entero) el programa debe indicarlo y debe pedir de nuevo el número.
* @author SantiTru
*/

public class Ejer1Tema14 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int numero;
//Inicializamos maximo con Integer.MIN_VALUE para que no nos de error al comparar con el primer número introducido. 
    int maximo=Integer.MIN_VALUE;   
//Declaramos un bucle for para pedir los 6 números
    for  (int i = 0; i < 6 ; i++) {
//Declaramos la variable correcto para comprobar que el número introcido es un número válido
      boolean correcto = false;
//Hacemos un bucle do-while para pedir 6 valores válidos
      do{
//Con el try y catch capturamos una posible excepción por número no válido.
        try{
          System.out.print("Introduce un número: ");
          numero = Integer.parseInt(teclado.nextLine());
            if (numero > maximo) {
              maximo = numero;
            }
            correcto = true;
            break;
        }catch(NumberFormatException e){
              System.out.println("Excepcion: " + e.getClass());
              System.out.println(("Error: " + e.getMessage()));
              System.out.print("Debes introducir un número válido. ");
        }
      }while (!correcto);
    }
//Mostramos el resultado  
    System.out.println("El número máximo de los introducidos es el: " + maximo);
    teclado.close();//cerramos Scanner
  }
}
