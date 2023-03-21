package EjerciciosDelLibro.Tema9.Ejer3Tema9;

/**
  @author: SantiTru
  @file: Lagarto.java
  @info: clase "Lagarto" - ejercicio 3
*/

public class Lagarto extends Animal{
  // constructor
    public Lagarto(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // tomarElSol
      public void tomarElSol(){
        System.out.println("El lagarto está tomando el sol.");
      }

    /****************/

    // cazar
      public void cazar(){
        System.out.println("El lagarto está cazando..");
      }
}




