package EjerciciosDelLibro.Tema9.C9_1.Ejer3Tema9;

/**
  @author: SantiTru
  @file: Gato.java
  @info: clase "Gato" - ejercicio 3
*/

public class Gato extends Mamifero{
  // constructor
    public Gato(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // arañar
      public void arañar(){
        System.out.println("El gato está arañando.");
      }

    /****************/

    // maullar
      public void maullar(){
        System.out.println("El gato está maullando.");
      }
}



