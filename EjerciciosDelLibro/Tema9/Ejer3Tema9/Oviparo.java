package EjerciciosDelLibro.Tema9.Ejer3Tema9;

/**
  @author: SantiTru
  @file: Ave.java
  @info: clase "Oviparo" - ejercicio 3
*/
  //atributo: poneHuevos,
  //metodos: @override volar, comer

public class Oviparo extends Animal{
  // constructor
    public Oviparo(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // volar
      public void volar(){
        System.out.println("El ave está volando.");
      }

    /****************/

    // picotear
      public void picotear(){
        System.out.println("El ave está picoteando.");
      }
}