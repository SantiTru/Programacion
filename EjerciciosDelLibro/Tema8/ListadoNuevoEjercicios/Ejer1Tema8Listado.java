package EjerciciosDelLibro.Tema8.ListadoNuevoEjercicios;
//En las dos lineas siguientes importo tanto la funcion Varias como la funcion de Scanner
import java.util.Scanner;
import misFunciones.Varias;

/*
 * Ejer1Tema8Listado.java
 * Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
 * resultado de multiplicarlos.
 * @author: @SantiTru
 */

public class Ejer1Tema8Listado {

  public static void main(String[] args) {
//Declaro las variables num1 y num2 donde voy a almacenar lo que introduzca por teclado el usuario
    double num1=0;
    double num2=0;
//Llamo a Scanner 
    Scanner teclado= new Scanner(System.in);
//Solicito al usuario los dos números a multiplicar y los almaceno en las variables num1 y num2
    System.out.println("Dime un número: ");
    num1= teclado.nextDouble();
    System.out.println("Dime un número: ");
    num2= teclado.nextDouble();
/*Declaro una nueva variable /result/ para almacenar el resultado de la operación por si fuese necesario 
* usar dicho resultado más adelante aún cuando esta nueva variable consume más memoria.
* En esta variable llamo a mi función multiplica para realizar la multiplicación entre los dos números 
* declarados por el usuario.
*/

    double result= Varias.multiplica(num1, num2);
//Imprimo por pantalla los numeros declarados por el usuario y el resultado de la variable result.
    System.out.println("El resultado de " + num1 +" x " + num2 + " es: "+ result);
teclado.close();
  }
}
  

