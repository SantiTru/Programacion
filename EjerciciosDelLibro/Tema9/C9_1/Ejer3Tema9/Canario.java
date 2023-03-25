package EjerciciosDelLibro.Tema9.Ejer3Tema9;

/**
  @author: SantiTru
  @file: Canario.java
  @info: clase "Canario" - ejercicio 3
*/

public class Canario extends Oviparo{
  // constructor
    public Canario(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // cantar
      public void cantar(){
        System.out.println("El canario está cantando.");
      }

    /****************/

    // picar
      public void picar(){
        System.out.println("El canario está picando.");
      }
}


  
