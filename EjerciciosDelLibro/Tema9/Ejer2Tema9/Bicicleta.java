package EjerciciosDelLibro.Tema9.Ejer2Tema9;

/**
* @file: Bicicleta.java
* @info: clase "Bicicleta" Ejer2Tema9
* @author SantiTru
*/

public class Bicicleta extends Vehiculo {
//número de piñones
  private int pinones; 
//Constructor
  public Bicicleta(int p) {
  super();
  this.pinones = p;
  }
/*
* Metodos: hazCaballito, Invertido y SinManos
*/        
  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
  }
  public void Invertido() {
    System.out.println("Estoy haciendo el invertido");
    System.out.println("Me he caido... :()");
  }
  public void SinManos() {
    System.out.println("Mira, mira mamá. sin manos!!");
    System.out.println("Me he caido... :()");
  }
}
