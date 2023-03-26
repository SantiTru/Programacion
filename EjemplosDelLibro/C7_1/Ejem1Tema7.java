package EjemplosDelLibro.C7_1;

/**
  @author: SantiTru
  @file: Ejem1Tema7.java
  @info: ejemplo del libro tema 7 Aprende Java con Ejercicios
*/

public class Ejem1Tema7{
  public static void main(String[] args){
// creación del array
// número de elementos
        int t=10;
        int[] n=new int[10]; 
// asignación de valores
      for(int i=0; i<6; i++){
        n[i]=(int)(Math.pow(i, i));
      }
 // elementos restantes
        n[6]=n[2]*10;
        n[7]=n[2]/10;
        n[8]=n[0]+n[1]+n[2];
        n[9]=n[8];
      for(int i=0; i<t; i++){
        System.out.print("| "+n[i]+" |");
      }
  }
}