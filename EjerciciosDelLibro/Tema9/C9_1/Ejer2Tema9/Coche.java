package EjerciciosDelLibro.Tema9.Ejer2Tema9;

/**
* @file: Coche.java
* @info: clase "Coche" Ejer 2 Tema 9 Aprende Java con Ejercicios
* @author SantiTru
*/

public class Coche extends Vehiculo {
  public int cilindrada; // cilindrada en cm3
  public Coche(int c) {
  super();
  this.cilindrada = c;
  }
  public void quemaRueda() {
  System.out.println("Wiiiiiiiiiiiiiiiiiiiiiiiiiiii");
  }
}
