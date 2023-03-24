package EjerciciosDelLibro.Tema8;
import java.util.Scanner;
import misFunciones.FunciArrays;

/*
* Crea una biblioteca de funciones para arrays (de una dimensión) de números
* enteros que contenga las siguientes funciones:
* 
* 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
* cuyo intervalo (mínimo y máximo) se indica como parámetro.
*
* @author: SantiTru
* @file: Ejer20Tema8.java
* @info: ejercicio 20 tema 8 Aprende Java con Ejercicios
*/
public class Ejer20Tema8 {
  public static void main(String[] args){
//Llamo Scanner
      Scanner s=new Scanner(System.in);
//Pido nº de elementos
        System.out.print("Dime el número de elementos que debe tener el Array: ");
          int ele=s.nextInt();
//Pido intervalo menor
      System.out.print("Dime el valor mínimo del Array: ");
        int min=s.nextInt();
//Pido intervalo menor
      System.out.print("Dime el valor máximo del Array: ");
        int max=s.nextInt();
//Cierro Scanner
      s.close();
//Imprimo por pantalla el array con los parametros introducidos usando la función generaArrayInt
      System.out.println("\n");
      for(int i=0; i<ele; i++){
        System.out.printf("| %-5d", FunciArrays.generaArrayInt(ele, min, max)[i]);
      }
      System.out.print(" |");
  }
}
