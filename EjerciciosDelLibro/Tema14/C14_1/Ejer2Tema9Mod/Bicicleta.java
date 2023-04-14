package EjerciciosDelLibro.Tema14.C14_1.Ejer2Tema9Mod;

/**
* @file: Bicicleta.java
* @info: clase "Bicicleta" Ejer 2 Tema 9 Aprende Java con Ejercicios
* @author SantiTru
*/

public class Bicicleta extends Vehiculo {
//número de piñones
  public int pinones; 
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
