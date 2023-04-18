package EjemplosDelLibro;
import java.util.ArrayList;

/**
* @file: EjemploArrayList.java
* @info: Programa para probar la funcionalidad del ArrayList.
* @author SantiTru
*/

public class EjemploArrayList {
  public static void main(String[] args){
    ArrayList <String> colores = new ArrayList<String>();


    colores.add("amarillo");
    colores.add("rojo");
    colores.add("azul");
    colores.add("verde");
    colores.add("amarillo");

    for (String color : colores){
      System.out.println(color);
    }
    System.out.println(" ");

    colores.remove("amarillo");

    for (String color : colores){
      System.out.println(color);
    }
    System.out.println(" ");

  }
/*

  int codigo = preguntarCodigo();
  int posicion = buscar(codigo);

  articulos.remove(posicion);

  private static int buscar (String codigo){

   //si no encuentra devolver: -1
  }

  private static int preguntarCodigo (String codigo){

  }
*/
  
}
