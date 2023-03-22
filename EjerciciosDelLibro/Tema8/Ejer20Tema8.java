package EjerciciosDelLibro.Tema8;
import java.util.Scanner;

/*
* Crea una biblioteca de funciones para arrays (de una dimensión) de números
* enteros que contenga las siguientes funciones:
* 
* 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
*    cuyo intervalo (mínimo y máximo) se indica como parámetro.
* 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
* 3. maximoArrayInt: Devuelve el máximo del array que se pasa como
*    parámetro.
* 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
* 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
* 6. posicionEnArray: Busca un número en un array y devuelve la posición
*    (el índice) en la que se encuentra.
* 7. volteaArrayInt: Le da la vuelta a un array.
* 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
*    array.
* 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
*    un array.
*  @author: SantiTru
*  @file: Ejer20Tema8.java
*  @info: ejercicio 20 tema 8 Aprende Java con Ejercicios
*/

public class Ejer20Tema8{
  /**
    @info:función para generar un array
    @param:
      - "x": nº de elementos
      - "y": intervalo menor
      - "z": intervalo mayor
    @return array: array generado
  */
    public static int[] generaArrayInt(int x, int y, int z){
      // array
        // nº de elementos
        int t=x;

        // creación
          int[] array=new int[t]; 

        // asignación de valores
          for(int i=0; i<t; i++){
            array[i]=(int)(Math.random()*(z-y+1)+y);
          }



      // return
        return array;
    }

    // main
      public static void main(String[] args){
        // scanner
          Scanner s=new Scanner(System.in);

      
        // nº de elementos
            System.out.print("Introduce el número de elementos que debe tener el array: ");
              int ele=s.nextInt();


        // intervalo menor
          System.out.print("Introduce el valor mínimo del intervalo de los valores: ");
            int min=s.nextInt();

  
        // intervalo menor
          System.out.print("Introduce el valor máximo del intervalo de los valores: ");
            int max=s.nextInt();

        // cierre de scanner
          s.close();


        // debug
          System.out.println("\n");

          for(int i=0; i<ele; i++){
            System.out.printf("| %-5d", generaArrayInt(ele, min, max)[i]);
          }

          System.out.print(" |");
      }
}