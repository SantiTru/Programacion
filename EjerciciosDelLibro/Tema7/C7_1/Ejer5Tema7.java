package EjerciciosDelLibro.Tema7.C7_1;
import java.util.Scanner;

/**
*  @author: SantiTru
*  @file: Ejer4Tema7.java
*  @info: Escribe un programa que pida 10 números por teclado y que luego muestre los
*         números introducidos junto con las palabras “máximo” y “mínimo” al lado del
*         máximo y del mínimo respectivamente.
*/

public class Ejer5Tema7{
  public static void main(String[] args){
// array
      int[] n=new int[10];
// variables
// máximo
        int max=0;
        String maxText="";
// mínimo
        int min=999999999;
        String minText="";
// números
// scanner
        Scanner s=new Scanner(System.in);
// obtención
        for(int i=0; i<10; i++){
          System.out.print("Dime un número: ");
            n[i]=s.nextInt();
// comprobación
// máximo
              if(n[i]>max){
                maxText="máximo --- "+n[i];
                max=n[i];
              }
// mínimo
              if(n[i]<min){
                minText="mínimo --- "+n[i];
                min=n[i];
              }
        }
// cierre scanner
        s.close();
      for(int i=0; i<10; i++){
        System.out.print("| "+n[i]+" |");
      }
      System.out.println();
      System.out.println(maxText);
      System.out.print(minText);
  }
}