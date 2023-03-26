package EjerciciosDelLibro.Tema9.C9_1.Ejer3Tema9;
  
/**
  @author: SantiTru
  @file: Pinguino.java
  @info: clase "Pinguino" - ejercicio 3
*/

public class Pinguino extends Oviparo{
  // constructor
    public Pinguino(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // nadar
      public void nadar(){
        System.out.println("El pingüino está nadando.");
      }

    /****************/

    // deslizarse
      public void deslizarse(){
        System.out.println("El pingüino está deslizándose.");
      }
}




