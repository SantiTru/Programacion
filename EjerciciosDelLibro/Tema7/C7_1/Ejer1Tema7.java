package EjerciciosDelLibro.Tema7.C7_1;

/**
*  @author: SantiTru
*  @file: Ejer1Tema7.java
*  @info: Define un array de 12 números enteros con nombre num y asigna los valores
*         según la tabla que se muestra a continuación. Muestra el contenido de todos
*         los elementos del array.
*         Posición  0   1   2   3   4   5   6   7   8   9   10   11
*         Valor    39  -2           0      14       5  120
*/

public class Ejer1Tema7{
  public static void main(String[] args){
// creación del array
      int[] num=new int[12];
// asignación de valores
        num[0]=39;
        num[1]=-2;
        num[4]=0;
        num[6]=14;
        num[8]=5;
        num[9]=120;
// contenido de todos los elementos
      for(int i=0; i<12; i++){
        System.out.print("| "+num[i]+" |");
      }
  }
}
//Los elementos no inicializados se incializan automaticamente a 0.