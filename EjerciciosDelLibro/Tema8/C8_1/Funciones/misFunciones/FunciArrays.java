package EjerciciosDelLibro.Tema8.C8_1.Funciones.misFunciones;

/**
* @file: FunciArrays.java
* @info: Funciones para trabajar con arrays
* @author: SantiTru
*/

public class FunciArrays {

/**
* @info:función para generar un array
* @param:
*   - "x": nº de elementos
*   - "y": intervalo menor
*   - "z": intervalo mayor
* @return array: array generado
*/
    public static int[] generaArrayInt(int x, int y, int z){
//array
//nº de elementos
        int t=x;
//creación
          int[] array=new int[t];
//asignación de valores
          for(int i=0; i<t; i++){
            array[i]=(int)(Math.random()*(z-y+1)+y);
          }
//return
        return array;
    }

/**
*  @info: función para obtener el mínimo de array
*  @param int[] x: array del que se saca el mínimo
*  @return min: valor mínimo del array
*/
    public static int minimoArrayInt(int[] x){
//variable para el mínimo
        int valorMin=Integer.MAX_VALUE;
//recorrer array
        for(int i=0; i<x.length; i++){
          if(x[i]<valorMin){
            valorMin=x[i];
          }
        }  
//return
        return valorMin;
    }

/**
*  @info: función para obtener el máximo de array
*  @param int[] x: array del que se saca el máximo
*  @return min: valor máximo del array
*/
    public static int maximoArrayInt(int[] x){
//variable para el máximo
        int valorMax=Integer.MIN_VALUE;
//recorrer array
        for(int i=0; i<x.length; i++){
          if(x[i]>valorMax){
            valorMax=x[i];
          }
        }
//return
        return valorMax;
    }

/**
*   @info: función para obtener la media del array
*   @param:
*   - "int[] x": array
*   - "y": nº de elementos totales del array
*   @return media: media del array
*/
    public static int mediaArrayInt(int[] x, int y){
//suma de los valores del array
        int suma=0;
//cálculo de la media
        for(int i=0; i<y; i++){
          suma+=x[i];
        }
        int media=suma/y;
//return
        return media;
    }

/**
*   @info: función para comprobar si un número está en el array
*   @param:
*   - "int[] x": array
*   - "y": valor a encontrar en el array
*   @return:
*   - "true": el valor se encuentra en el array
*   - "false": el valor no se encuentra en el array
*/
    public static boolean estaEnArrayInt(int[] x, int y){
//variable booleana
        boolean esta=false; 
//bucle para recorrer el array para encontrar el valor
        for(int i=0; i<x.length; i++){
          if(x[i]==y){
            return true;
          }
        }  
//return predeterminado
        return esta;
    }
  
/**
*   @info: función para obtener la posición de un valor en el array
*   @param:
*   - "int[] x": array
*   - "y": valor a encontrar en el array
*   @return pos: posición del valor en el array
*/
    public static int posicionEnArray(int[] x, int y){
//variable para acumular la posición
        int pos=0;     
//bucle para recorrer el array
        for(int i=0; i<x.length; i++){
          if(x[i]==y){
            pos=i;
          }
        }    
//return
        return pos;
    }

/**
*   @info: función para obtener el array de forma invertida
*   @param
*   - "int[] x": array a invertir
*   - "y": nº de elementos del array
*   @return arrayInvertido: array invertido
*/
    public static int[] volteaArrayInt(int[] x, int y){
//array invertido
//creación
          int[] arrayInvertido=new int[y];
//variable auxiliar
          int j=0;
//guardando los valores de forma inversa
          for(int i=y-1; i>=0; i--){
            arrayInvertido[j]=x[i];
            j++;
          }
//return
        return arrayInvertido;
    }

/**
*   @info: función para rotar n posiciones a la derecha el array
*   @param:
*   - "int[] x": array
*   - "y": nº de elementos del array
*   - "z": nº de posiciones a rotar
*   @return arrayDerecha: array rotado n posiciones a la derecha
*/
    public static int[] rotaDerechaArrayInt(int[] x, int y, int z){
        int[] arrayDerecha=new int[y];

        for(int i=0; i<y; i++){
/*
*El módulo calcula la nueva posición que debe obtener el valor en la posición actual,
*es decir, el elemento con posición "[(i+z)%y]" es igual al valor con posición 0 
*del array original, y así sucesivamente.
*/
          arrayDerecha[(i+z)%y]=x[i];
        }
        return arrayDerecha;
    }

/**
*   @info: función para rotar n posiciones a la izquierda el array
*   @param:
*   - "int[] x": array
*   - "y": nº de elementos del array
*   - "z": nº de posiciones a rotar
*   @return arrayIzquierda: array rotado n posiciones a la izquierda
*/
    public static int[] rotaIzquierdaArrayInt(int[] x, int y, int z){
      int[] arrayIzquierda=new int[y];
//bucle para recorrer el array
      for(int i=0; i<y; i++){
/*
*El módulo calcula el índice exacto donde se debe colocar el valor 
*del array original. Se suma el índice actual y la longitud total del array para obtener la 
*posición del elemento después de rotar todo el array hacia la izquierda una vez, 
*añadiendo el nº de rotaciones ("z"), da como resultado la posición después de 
*rotar "z" veces hacia la izquierda.        
*/
        arrayIzquierda[i]=x[(i+y-z)%y];
      }
      return arrayIzquierda;
    }
 
/**
*   @info: función para array de números naturales
*   @param x: tamaño del array
*   @return arrayNaturales: array de números naturales
*/
    public static int[] arrayNaturales(int x){
//array de números naturales
        int[] arrayNaturales=new int[x];
//variable auxiliar  
        int aux=0;
//bucle para recorrer el array
        for(int i=1; aux<x; i++){
          arrayNaturales[aux]=i;
          aux++;
        }
//return
        return arrayNaturales;
    }
}