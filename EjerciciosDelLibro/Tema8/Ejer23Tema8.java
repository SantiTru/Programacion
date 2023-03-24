package EjerciciosDelLibro.Tema8;
import java.util.Scanner;
import misFunciones.FunciArrays;

/*
* Crea una biblioteca de funciones para arrays (de una dimensión) de números
* enteros que contenga las siguientes funciones:
* 
* 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
*
*  @author: SantiTru
*  @file: Ejer20Tema8.java
*  @info: ejercicio 20 tema 8 Aprende Java con Ejercicios
*/

public class Ejer23Tema8 {
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
    //Almaceno el Array
        int[] arrayGuardado=new int[ele];
    //Asigno los valores
        for(int i=0; i<ele; i++){
          arrayGuardado[i]=FunciArrays.generaArrayInt(ele, min, max)[i];
        }
        System.out.println("");

        for(int i=0; i<ele; i++){
    //Imprimo por pantalla el array con los parametros introducidos usando la función generaArrayInt        
          System.out.printf("| %-5d", arrayGuardado[i]);
        }
        System.out.println(" |");
    //Imprimo por pantalla el valor más alto del Array usando la función maximoArrayInt
        System.out.print("\nEl valor más alto de este array es: "+FunciArrays.maximoArrayInt(arrayGuardado)+".");
    //Imprimo por pantalla el minimo de los valores del Array usando la función minimoArrayInt
        System.out.print("\nEl valor mínimo de este array es: "+FunciArrays.minimoArrayInt(arrayGuardado)+".");
    //Imprimo por pantalla la media de los valores del Array usando la función mediaArrayInt
        System.out.print("\nLa media de los valores de este array es: "+FunciArrays.mediaArrayInt(arrayGuardado, ele)+"."); 
 
  }

}