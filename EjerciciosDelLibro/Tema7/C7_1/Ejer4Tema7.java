package EjerciciosDelLibro.Tema7.C7_1;

/**
*  @author: SantiTru
*  @file: Ejer4Tema7.java
*  @info: Define tres arrays de 20 números enteros cada una, con nombres
*         “numero”, “cuadrado” y “cubo”. Carga el array “numero” con valores
*         aleatorios entre 0 y 100. En el array “cuadrado” se deben almacenar
*         los cuadrados de los valores que hay en el array “numero”. En el
*         array “cubo” se deben almacenar los cubos de los valores que hay
*         en “numero”. A continuación, muestra el contenido de los tres arrays
*         dispuesto en tres columnas.
*/

public class Ejer4Tema7{
  public static void main(String[] args){
// arrays
// primero
        int[] numero=new int[20];
// segundo
        int[] cuadrado=new int[20];
// tercero
        int[] cubo=new int[20];
// valores del array "numero"
      for(int i=0; i<20; i++){
        numero[i]=(int)(Math.random()*101);
      }
// valores del array "cuadrado"
      for(int i=0; i<20; i++){
        cuadrado[i]=(int)(Math.pow((numero[i]), 2));
      }
// valores del array "cubo"
      for(int i=0; i<20; i++){
        cubo[i]=(int)(Math.pow((numero[i]), 3));
      }
// impresión con formato del resultado
      System.out.println("  n  │   n²  │    n³\n─────┼───────┼─────────");
      for (int i = 0; i < 20; i++) {
        System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
      }
  }
}