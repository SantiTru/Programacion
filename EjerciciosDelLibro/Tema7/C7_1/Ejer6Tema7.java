package EjerciciosDelLibro.Tema7.C7_1;
import java.util.Scanner;

/**
*  @author: SantiTru
*  @file: Ejer6Tema7.java
*  @info: Escribe un programa que lea 15 números por teclado y que los almacene en un
*         array. Rota los elementos de ese array, es decir, el elemento de la posición 0
*         debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
*         la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
*         del array.
*/

public class Ejer6Tema7{
  public static void main(String[] args){
// creación array
        int[] n=new int[15];
// asignación de valores
// apertura de scanner
          Scanner s=new Scanner(System.in);
// obtención de los valores
          for(int i=0; i<15; i++){
            System.out.print("Dime un número: ");
              n[i]=s.nextInt();
          }
// cierre de scanner
          s.close();
// rotación y variable auxiliar
        int aux=n[14];
        for(int i=14; i>0; i--){
          n[i]=n[i-1];
        }
        n[0]=aux;
// contenido final
      for(int i=0; i<15; i++){
        System.out.print("| "+n[i]+" |");
      }
  }
}