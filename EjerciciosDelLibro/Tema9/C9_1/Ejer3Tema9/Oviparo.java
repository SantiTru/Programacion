package EjerciciosDelLibro.Tema9.C9_1.Ejer3Tema9;

/**
  @author: SantiTru
  @file: Oviparo.java
  @info: clase "Oviparo" - ejercicio 3
*/
//atributo: poneHuevos, hacerNido

public class Oviparo extends Animal{
// constructor
    public Oviparo(String nombre, int edad){
      super(nombre, edad);
    }
// métodos
// poneHuevos
      public void poneHuevos(){
        System.out.println("El Oviparo está poniendo un huevo.");
      }
// hacerNido
      public void hacerNido(){
        System.out.println("El Oviparo está haciendo un nido.");
      }
}