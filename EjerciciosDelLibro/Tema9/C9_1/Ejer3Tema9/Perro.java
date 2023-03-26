package EjerciciosDelLibro.Tema9.C9_1.Ejer3Tema9;

/**
  @author: SantiTru
  @file: Perro.java
  @info: clase "Perro" - ejercicio 3
*/

public class Perro extends Mamifero{
  // constructor
    public Perro(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // ladrar
      public void ladrar(){
        System.out.println("El perro está ladrando.");
      }

    /****************/

    // morder
      public void morder(){
        System.out.println("El perro está mordiendo.");
      }
}




