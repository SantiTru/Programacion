package EjerciciosDelLibro.Tema7.C7_1;

/**
*  @author: SantiTru
*  @file: Ejer2Tema7.java
*  @info: Define un array de 10 simboloes con nombre “simbolo” y asigna
*         valores a los elementos según la siguiente tabla:
*         Posición  0   1   2   3   4   5   6   7   8   9
*         Valor    'a' 'x'         '@'    '  ' '+' 'Q'
*
*    Muestra el contenido de todos los elementos del array.
*/

public class Ejer2Tema7{
  public static void main(String[] args){
// creación del array
      char[] simbolo=new char[10];
// asignación de valores
        simbolo[0]='a';
        simbolo[1]='x';
        simbolo[4]='@';
        simbolo[6]=' ';
        simbolo[7]='+';
        simbolo[8]='Q';
// contenido de los elementos
      for(int i=0; i<10; i++){
        System.out.print("| "+simbolo[i]+" |");
      }
  }
}
//Los elementos no inicializados se incializan automaticamente con simbolo vacio.