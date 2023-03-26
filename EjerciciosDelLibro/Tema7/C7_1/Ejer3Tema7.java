package EjerciciosDelLibro.Tema7.C7_1;
import java.util.Scanner;

/**
*  @author: SantiTru
*  @file: Ejer2Tema7.java
*  @info: Escribe un programa que lea 10 números por teclado y que luego
*         los muestre en orden inverso, es decir, el primero que se
*         introduce es el último en mostrarse y viceversa.
*/

public class Ejer3Tema7{
  public static void main(String[] args){
// array auxiliar
      int[] aux=new int[10];
    
// array final
      int[] finalArray=new int[10];
// contador auxiliar
      int cont=0;
// números
// scanner
        Scanner s=new Scanner(System.in);
// obtención
        for(int i=0; i<10; i++){
          System.out.print("Introduce un número: ");
            aux[i]=s.nextInt();
        }
// cierre de scanner
        s.close();
// reordenamiento
        for(int i=9; i>=0; i--){
          finalArray[i]=aux[cont];
            cont++;
        }
// contenido final
      for(int i=0; i<10; i++){
        System.out.print("| "+finalArray[i]+" |");
      }
  }
}
